

/**
 * Reporting targeting type for ad groups
 */
export const AdsAnalyticsAdGroupTargetingType = {
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
    AgeBucketAndGender: 'AGE_BUCKET_AND_GENDER',
    CreativeEnhancements: 'CREATIVE_ENHANCEMENTS'
} as const;
export type AdsAnalyticsAdGroupTargetingType = typeof AdsAnalyticsAdGroupTargetingType[keyof typeof AdsAnalyticsAdGroupTargetingType];

