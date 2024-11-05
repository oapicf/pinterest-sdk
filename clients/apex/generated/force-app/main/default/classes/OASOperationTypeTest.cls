@isTest
private class OASOperationTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOperationType> expected = new Set<OASOperationType>{
            OASOperationType.SHARE,
            OASOperationType.REVOKE
        };
        Set<OASOperationType> actual  = new Set<OASOperationType>(OASOperationType.values());
        System.assertEquals(expected, actual);
    }
}
