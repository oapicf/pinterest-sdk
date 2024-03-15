@isTest
private class OASDataStatusTest {
    @isTest
    private static void allowableValues() {
        Set<OASDataStatus> expected = new Set<OASDataStatus>{
            OASDataStatus.PROCESSING,
            OASDataStatus.READY,
            OASDataStatus.ESTIMATE,
            OASDataStatus.BEFORE_BUSINESS_CREATED,
            OASDataStatus.BEFORE_DATA_RETENTION_PERIOD,
            OASDataStatus.BEFORE_PIN_DATA_RETENTION_PERIOD,
            OASDataStatus.BEFORE_METRIC_START_DATE,
            OASDataStatus.BEFORE_CORE_METRIC_START_DATE,
            OASDataStatus.BEFORE_PIN_FORMAT_METRIC_START_DATE,
            OASDataStatus.BEFORE_AUDIENCE_METRIC_START_DATE,
            OASDataStatus.BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE,
            OASDataStatus.BEFORE_VIDEO_METRIC_START_DATE,
            OASDataStatus.BEFORE_CONVERSION_METRIC_START_DATE,
            OASDataStatus.PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD,
            OASDataStatus.IN_BAD_TAG_DATE,
            OASDataStatus.BEFORE_PUBLISHED_METRIC_START_DATE,
            OASDataStatus.BEFORE_ASSIST_METRIC_START_DATE,
            OASDataStatus.BEFORE_PIN_CREATED,
            OASDataStatus.BEFORE_ACCOUNT_CLAIMED,
            OASDataStatus.BEFORE_DEMOGRAPHIC_FILTERS_START_DATE,
            OASDataStatus.AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD,
            OASDataStatus.AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD,
            OASDataStatus.BEFORE_PRODUCT_GROUP_FILTER_START_DATE
        };
        Set<OASDataStatus> actual  = new Set<OASDataStatus>(OASDataStatus.values());
        System.assertEquals(expected, actual);
    }
}
