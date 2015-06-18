package br.com.segware;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class ReportAnalyzerTest {

    IReportAnalyzer analyzer;

    @Before
    public void before() throws IOException {
        // analyzer = your implementation
    }

    @Test
    public void totalEventsCustomer0001() {
        assertEquals(7, analyzer.getTotalEventsCustomer().get("0001"), 0);
    }

    @Test
    public void totalEventsCustomer0003() {
        assertEquals(3, analyzer.getTotalEventsCustomer().get("0003"), 0);
    }

    @Test
    public void averageAttendanceTimeInSecondsPersonIdAT01() {
        assertEquals(159, analyzer.getAverageAttendanceTimePerson().get("AT01"), 0);
    }

    @Test
    public void averageAttendanceTimeInSecondsPersonIdAT02() {
        assertEquals(156, analyzer.getAverageAttendanceTimePerson().get("AT02"), 0);
    }

    @Test
    public void typesWithMoreEvents() {
        assertArrayEquals(new Type[]{Type.ALARM, Type.DISARM, Type.TEST, Type.ARM},
                analyzer.getTypesOrderedByTotalEventsDescending().toArray(new Type[Type.values().length]));
    }

    @Test
    public void identifyDisarmAfterArmEvent() {
        assertArrayEquals(new Integer[]{7}, analyzer.getSequentialCodesDisarmEventAfterArm().toArray(new Integer[1]));
    }
}