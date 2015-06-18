Developer test
======================

## Initial considerations

The test consists in reading a file and generate some statistics.

You should implement IReportAnalyze interface, so ReportAnalyzeTest tests can pass.

The test is done when all tests passes.

More information about what should be done are in interface's javadoc.

## File format

The file format is:

```
sequential code,customer code, event code,event type,start date,end date,person id
```

Example:

```
1,0001,E130,ALARM,2014-06-25 12:00:00,2014-06-25 12:05:32,AT01
2,0002,E131,ARM,2014-06-25 12:01:03,2014-06-25 12:05:36,AT02
```
