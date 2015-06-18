package br.com.segware;

import java.util.List;
import java.util.Map;

public interface IReportAnalyzer {

    /**
     * Total events grouped by customer.<br/>
     * <ul>
     * <li>key: Customer code</li>
     * <li>value: Total events</li>
     * </ul>
     *
     * @return Total events grouped by customer.
     */
    Map<String, Integer> getTotalEventsCustomer();

    /**
     * Average attendance time by person.<br/>
     * Attendance time is defined by
     *
     * <pre>
     * End date - Start date
     * </pre>
     * <ul>
     * <li>key: Person id</li>
     * <li>value: Average attendance time (in seconds)</li>
     * </ul>
     *
     * @return Average attendance time by person, in seconds.
     */
    Map<String, Long> getAverageAttendanceTimePerson();

    /**
     * Returns a list of event types, ordered by total events descending.
     *
     * @return Event types.
     */
    List<Type> getTypesOrderedByTotalEventsDescending();

    /**
     * Returns the sequential code of a disarm event that occurred after an alarm event.<br/>
     * IMPORTANT: notice that this event type should only be reported when disarm occurs until 5 minutes before an alarm.<br/>
     * If the time between events is greater than 5 minutes, shouldn't be reported.<br/>
     * The time to be considered is always based on start date.
     *
     * @return List of sequencial codes of disarm events after an alarm.
     */
    List<Integer> getSequentialCodesDisarmEventAfterArm();
}
