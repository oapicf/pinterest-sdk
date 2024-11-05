@isTest
private class OASAudienceShareTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASAudienceShareType> expected = new Set<OASAudienceShareType>{
            OASAudienceShareType.SHARED,
            OASAudienceShareType.RECEIVED
        };
        Set<OASAudienceShareType> actual  = new Set<OASAudienceShareType>(OASAudienceShareType.values());
        System.assertEquals(expected, actual);
    }
}
