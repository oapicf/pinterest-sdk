@isTest
private class OASBatchOperationTest {
    @isTest
    private static void allowableValues() {
        Set<OASBatchOperation> expected = new Set<OASBatchOperation>{
            OASBatchOperation.UPDATE,
            OASBatchOperation.UPSERT,
            OASBatchOperation.CREATE,
            OASBatchOperation.DELETE_DISCONTINUED,
            OASBatchOperation.DELETE
        };
        Set<OASBatchOperation> actual  = new Set<OASBatchOperation>(OASBatchOperation.values());
        System.assertEquals(expected, actual);
    }
}
