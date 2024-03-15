@isTest
private class OASAudienceUpdateOperationTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASAudienceUpdateOperationType> expected = new Set<OASAudienceUpdateOperationType>{
            OASAudienceUpdateOperationType.UPDATE,
            OASAudienceUpdateOperationType.REMOVE
        };
        Set<OASAudienceUpdateOperationType> actual  = new Set<OASAudienceUpdateOperationType>(OASAudienceUpdateOperationType.values());
        System.assertEquals(expected, actual);
    }
}
