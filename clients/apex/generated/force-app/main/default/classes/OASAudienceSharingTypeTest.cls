@isTest
private class OASAudienceSharingTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASAudienceSharingType> expected = new Set<OASAudienceSharingType>{
            OASAudienceSharingType.CUSTOM,
            OASAudienceSharingType.SYNDICATED
        };
        Set<OASAudienceSharingType> actual  = new Set<OASAudienceSharingType>(OASAudienceSharingType.values());
        System.assertEquals(expected, actual);
    }
}
