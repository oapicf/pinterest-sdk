@isTest
private class OASBatchOperationTest {
    @isTest
    private static void allowableValues() {
        Set<OASBatchOperation> expected = new Set<OASBatchOperation>{
            OASBatchOperation.UPDATE,
            OASBatchOperation.CREATE,
            OASBatchOperation.UPSERT
        };
        Set<OASBatchOperation> actual  = new Set<OASBatchOperation>(OASBatchOperation.values());
        System.assertEquals(expected, actual);
    }
}
