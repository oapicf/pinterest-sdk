@isTest
private class OASAudienceInsightTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASAudienceInsightType> expected = new Set<OASAudienceInsightType>{
            OASAudienceInsightType.YOUR_TOTAL_AUDIENCE,
            OASAudienceInsightType.YOUR_ENGAGED_AUDIENCE,
            OASAudienceInsightType.PINTEREST_TOTAL_AUDIENCE
        };
        Set<OASAudienceInsightType> actual  = new Set<OASAudienceInsightType>(OASAudienceInsightType.values());
        System.assertEquals(expected, actual);
    }
}
