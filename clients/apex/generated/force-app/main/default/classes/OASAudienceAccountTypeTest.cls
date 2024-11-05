@isTest
private class OASAudienceAccountTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASAudienceAccountType> expected = new Set<OASAudienceAccountType>{
            OASAudienceAccountType.AD_ACCOUNT,
            OASAudienceAccountType.BUSINESS_ACCOUNT
        };
        Set<OASAudienceAccountType> actual  = new Set<OASAudienceAccountType>(OASAudienceAccountType.values());
        System.assertEquals(expected, actual);
    }
}
