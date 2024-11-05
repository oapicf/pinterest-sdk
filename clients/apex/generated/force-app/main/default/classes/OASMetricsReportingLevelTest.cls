@isTest
private class OASMetricsReportingLevelTest {
    @isTest
    private static void allowableValues() {
        Set<OASMetricsReportingLevel> expected = new Set<OASMetricsReportingLevel>{
            OASMetricsReportingLevel.ADVERTISER,
            OASMetricsReportingLevel.ADVERTISER_TARGETING,
            OASMetricsReportingLevel.CAMPAIGN,
            OASMetricsReportingLevel.CAMPAIGN_TARGETING,
            OASMetricsReportingLevel.AD_GROUP,
            OASMetricsReportingLevel.AD_GROUP_TARGETING,
            OASMetricsReportingLevel.PIN_PROMOTION,
            OASMetricsReportingLevel.PIN_PROMOTION_TARGETING,
            OASMetricsReportingLevel.KEYWORD,
            OASMetricsReportingLevel.PRODUCT_GROUP,
            OASMetricsReportingLevel.PRODUCT_GROUP_TARGETING,
            OASMetricsReportingLevel.PRODUCT_ITEM,
            OASMetricsReportingLevel.PRODUCT_ITEM_TARGETING
        };
        Set<OASMetricsReportingLevel> actual  = new Set<OASMetricsReportingLevel>(OASMetricsReportingLevel.values());
        System.assertEquals(expected, actual);
    }
}
