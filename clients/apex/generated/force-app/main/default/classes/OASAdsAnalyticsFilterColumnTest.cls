@isTest
private class OASAdsAnalyticsFilterColumnTest {
    @isTest
    private static void allowableValues() {
        Set<OASAdsAnalyticsFilterColumn> expected = new Set<OASAdsAnalyticsFilterColumn>{
            OASAdsAnalyticsFilterColumn.SPEND_IN_DOLLAR,
            OASAdsAnalyticsFilterColumn.TOTAL_IMPRESSION
        };
        Set<OASAdsAnalyticsFilterColumn> actual  = new Set<OASAdsAnalyticsFilterColumn>(OASAdsAnalyticsFilterColumn.values());
        System.assertEquals(expected, actual);
    }
}
