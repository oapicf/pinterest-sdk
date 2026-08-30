

/**
 * Reporting targeting type
 */
export const AdAdsAnalyticsAsyncTargetingTypes = {
    Keyword: 'KEYWORD',
    Apptype: 'APPTYPE',
    Gender: 'GENDER',
    Location: 'LOCATION',
    Placement: 'PLACEMENT',
    Country: 'COUNTRY',
    TargetedInterest: 'TARGETED_INTEREST',
    PinnerInterest: 'PINNER_INTEREST',
    AudienceInclude: 'AUDIENCE_INCLUDE',
    Geo: 'GEO',
    AgeBucket: 'AGE_BUCKET',
    Region: 'REGION',
    MediaType: 'MEDIA_TYPE',
    AgeBucketAndGender: 'AGE_BUCKET_AND_GENDER',
    AudienceMultiplier: 'AUDIENCE_MULTIPLIER',
    CreativeEnhancements: 'CREATIVE_ENHANCEMENTS',
    LocalAdsStoreCode: 'LOCAL_ADS_STORE_CODE'
} as const;
export type AdAdsAnalyticsAsyncTargetingTypes = typeof AdAdsAnalyticsAsyncTargetingTypes[keyof typeof AdAdsAnalyticsAsyncTargetingTypes];

