@isTest
private class OASUserListOperationTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASUserListOperationType> expected = new Set<OASUserListOperationType>{
            OASUserListOperationType.ADD,
            OASUserListOperationType.REMOVE
        };
        Set<OASUserListOperationType> actual  = new Set<OASUserListOperationType>(OASUserListOperationType.values());
        System.assertEquals(expected, actual);
    }
}
