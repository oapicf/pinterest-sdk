

/**
 * Reporting targeting type
 */
export const AdsAnalyticsAccountTargetingType = {
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
    AgeBucketAndGender: 'AGE_BUCKET_AND_GENDER'
} as const;
export type AdsAnalyticsAccountTargetingType = typeof AdsAnalyticsAccountTargetingType[keyof typeof AdsAnalyticsAccountTargetingType];

