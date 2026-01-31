@isTest
private class OASAdsAnalyticsAdGroupTargetingTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASAdsAnalyticsAdGroupTargetingType> expected = new Set<OASAdsAnalyticsAdGroupTargetingType>{
            OASAdsAnalyticsAdGroupTargetingType.KEYWORD,
            OASAdsAnalyticsAdGroupTargetingType.APPTYPE,
            OASAdsAnalyticsAdGroupTargetingType.GENDER,
            OASAdsAnalyticsAdGroupTargetingType.LOCATION,
            OASAdsAnalyticsAdGroupTargetingType.PLACEMENT,
            OASAdsAnalyticsAdGroupTargetingType.COUNTRY,
            OASAdsAnalyticsAdGroupTargetingType.TARGETED_INTEREST,
            OASAdsAnalyticsAdGroupTargetingType.PINNER_INTEREST,
            OASAdsAnalyticsAdGroupTargetingType.AUDIENCE_INCLUDE,
            OASAdsAnalyticsAdGroupTargetingType.GEO,
            OASAdsAnalyticsAdGroupTargetingType.AGE_BUCKET,
            OASAdsAnalyticsAdGroupTargetingType.REGION,
            OASAdsAnalyticsAdGroupTargetingType.AGE_BUCKET_AND_GENDER,
            OASAdsAnalyticsAdGroupTargetingType.CREATIVE_ENHANCEMENTS
        };
        Set<OASAdsAnalyticsAdGroupTargetingType> actual  = new Set<OASAdsAnalyticsAdGroupTargetingType>(OASAdsAnalyticsAdGroupTargetingType.values());
        System.assertEquals(expected, actual);
    }
}
