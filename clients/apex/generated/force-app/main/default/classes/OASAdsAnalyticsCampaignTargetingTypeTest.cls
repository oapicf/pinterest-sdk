@isTest
private class OASAdsAnalyticsCampaignTargetingTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASAdsAnalyticsCampaignTargetingType> expected = new Set<OASAdsAnalyticsCampaignTargetingType>{
            OASAdsAnalyticsCampaignTargetingType.KEYWORD,
            OASAdsAnalyticsCampaignTargetingType.APPTYPE,
            OASAdsAnalyticsCampaignTargetingType.GENDER,
            OASAdsAnalyticsCampaignTargetingType.LOCATION,
            OASAdsAnalyticsCampaignTargetingType.PLACEMENT,
            OASAdsAnalyticsCampaignTargetingType.COUNTRY,
            OASAdsAnalyticsCampaignTargetingType.TARGETED_INTEREST,
            OASAdsAnalyticsCampaignTargetingType.PINNER_INTEREST,
            OASAdsAnalyticsCampaignTargetingType.AUDIENCE_INCLUDE,
            OASAdsAnalyticsCampaignTargetingType.GEO,
            OASAdsAnalyticsCampaignTargetingType.AGE_BUCKET,
            OASAdsAnalyticsCampaignTargetingType.REGION,
            OASAdsAnalyticsCampaignTargetingType.CREATIVE_TYPE,
            OASAdsAnalyticsCampaignTargetingType.AGE_BUCKET_AND_GENDER
        };
        Set<OASAdsAnalyticsCampaignTargetingType> actual  = new Set<OASAdsAnalyticsCampaignTargetingType>(OASAdsAnalyticsCampaignTargetingType.values());
        System.assertEquals(expected, actual);
    }
}
