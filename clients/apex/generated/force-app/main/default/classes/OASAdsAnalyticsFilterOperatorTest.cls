@isTest
private class OASAdsAnalyticsFilterOperatorTest {
    @isTest
    private static void allowableValues() {
        Set<OASAdsAnalyticsFilterOperator> expected = new Set<OASAdsAnalyticsFilterOperator>{
            OASAdsAnalyticsFilterOperator.LESS_THAN,
            OASAdsAnalyticsFilterOperator.GREATER_THAN
        };
        Set<OASAdsAnalyticsFilterOperator> actual  = new Set<OASAdsAnalyticsFilterOperator>(OASAdsAnalyticsFilterOperator.values());
        System.assertEquals(expected, actual);
    }
}
