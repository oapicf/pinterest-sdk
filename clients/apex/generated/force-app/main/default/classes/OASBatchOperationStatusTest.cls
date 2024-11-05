@isTest
private class OASBatchOperationStatusTest {
    @isTest
    private static void allowableValues() {
        Set<OASBatchOperationStatus> expected = new Set<OASBatchOperationStatus>{
            OASBatchOperationStatus.PROCESSING,
            OASBatchOperationStatus.COMPLETED,
            OASBatchOperationStatus.FAILED
        };
        Set<OASBatchOperationStatus> actual  = new Set<OASBatchOperationStatus>(OASBatchOperationStatus.values());
        System.assertEquals(expected, actual);
    }
}
