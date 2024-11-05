@isTest
private class OASAdsAnalyticsAdTargetingTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASAdsAnalyticsAdTargetingType> expected = new Set<OASAdsAnalyticsAdTargetingType>{
            OASAdsAnalyticsAdTargetingType.KEYWORD,
            OASAdsAnalyticsAdTargetingType.APPTYPE,
            OASAdsAnalyticsAdTargetingType.GENDER,
            OASAdsAnalyticsAdTargetingType.LOCATION,
            OASAdsAnalyticsAdTargetingType.PLACEMENT,
            OASAdsAnalyticsAdTargetingType.COUNTRY,
            OASAdsAnalyticsAdTargetingType.TARGETED_INTEREST,
            OASAdsAnalyticsAdTargetingType.PINNER_INTEREST,
            OASAdsAnalyticsAdTargetingType.AUDIENCE_INCLUDE,
            OASAdsAnalyticsAdTargetingType.GEO,
            OASAdsAnalyticsAdTargetingType.AGE_BUCKET,
            OASAdsAnalyticsAdTargetingType.REGION,
            OASAdsAnalyticsAdTargetingType.QUIZ_RESULT,
            OASAdsAnalyticsAdTargetingType.AGE_BUCKET_AND_GENDER
        };
        Set<OASAdsAnalyticsAdTargetingType> actual  = new Set<OASAdsAnalyticsAdTargetingType>(OASAdsAnalyticsAdTargetingType.values());
        System.assertEquals(expected, actual);
    }
}
