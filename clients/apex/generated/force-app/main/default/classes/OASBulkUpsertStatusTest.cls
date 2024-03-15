@isTest
private class OASBulkUpsertStatusTest {
    @isTest
    private static void allowableValues() {
        Set<OASBulkUpsertStatus> expected = new Set<OASBulkUpsertStatus>{
            OASBulkUpsertStatus.RUNNING,
            OASBulkUpsertStatus.SUCCEEDED,
            OASBulkUpsertStatus.FAILED
        };
        Set<OASBulkUpsertStatus> actual  = new Set<OASBulkUpsertStatus>(OASBulkUpsertStatus.values());
        System.assertEquals(expected, actual);
    }
}
