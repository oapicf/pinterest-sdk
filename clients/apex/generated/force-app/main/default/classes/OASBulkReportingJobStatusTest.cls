@isTest
private class OASBulkReportingJobStatusTest {
    @isTest
    private static void allowableValues() {
        Set<OASBulkReportingJobStatus> expected = new Set<OASBulkReportingJobStatus>{
            OASBulkReportingJobStatus.DOES_NOT_EXIST,
            OASBulkReportingJobStatus.FINISHED,
            OASBulkReportingJobStatus.IN_PROGRESS,
            OASBulkReportingJobStatus.EXPIRED,
            OASBulkReportingJobStatus.FAILED,
            OASBulkReportingJobStatus.CANCELLED
        };
        Set<OASBulkReportingJobStatus> actual  = new Set<OASBulkReportingJobStatus>(OASBulkReportingJobStatus.values());
        System.assertEquals(expected, actual);
    }
}
