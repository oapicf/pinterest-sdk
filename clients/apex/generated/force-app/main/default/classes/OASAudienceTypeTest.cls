@isTest
private class OASAudienceTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASAudienceType> expected = new Set<OASAudienceType>{
            OASAudienceType.CUSTOMER_LIST,
            OASAudienceType.VISITOR,
            OASAudienceType.ENGAGEMENT,
            OASAudienceType.ACTALIKE,
            OASAudienceType.PERSONA
        };
        Set<OASAudienceType> actual  = new Set<OASAudienceType>(OASAudienceType.values());
        System.assertEquals(expected, actual);
    }
}
