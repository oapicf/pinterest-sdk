@isTest
private class OASPartnerTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASPartnerType> expected = new Set<OASPartnerType>{
            OASPartnerType.INTERNAL,
            OASPartnerType.EXTERNAL
        };
        Set<OASPartnerType> actual  = new Set<OASPartnerType>(OASPartnerType.values());
        System.assertEquals(expected, actual);
    }
}
