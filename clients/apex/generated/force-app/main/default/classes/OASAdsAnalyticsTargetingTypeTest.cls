@isTest
private class OASAdsAnalyticsTargetingTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASAdsAnalyticsTargetingType> expected = new Set<OASAdsAnalyticsTargetingType>{
            OASAdsAnalyticsTargetingType.KEYWORD,
            OASAdsAnalyticsTargetingType.APPTYPE,
            OASAdsAnalyticsTargetingType.GENDER,
            OASAdsAnalyticsTargetingType.LOCATION,
            OASAdsAnalyticsTargetingType.PLACEMENT,
            OASAdsAnalyticsTargetingType.COUNTRY,
            OASAdsAnalyticsTargetingType.TARGETED_INTEREST,
            OASAdsAnalyticsTargetingType.PINNER_INTEREST,
            OASAdsAnalyticsTargetingType.AUDIENCE_INCLUDE,
            OASAdsAnalyticsTargetingType.GEO,
            OASAdsAnalyticsTargetingType.AGE_BUCKET,
            OASAdsAnalyticsTargetingType.REGION,
            OASAdsAnalyticsTargetingType.AGE_BUCKET_AND_GENDER
        };
        Set<OASAdsAnalyticsTargetingType> actual  = new Set<OASAdsAnalyticsTargetingType>(OASAdsAnalyticsTargetingType.values());
        System.assertEquals(expected, actual);
    }
}
