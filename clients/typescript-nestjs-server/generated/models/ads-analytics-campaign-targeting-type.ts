

/**
 * Reporting targeting type for campaigns
 */
export const AdsAnalyticsCampaignTargetingType = {
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
    CreativeType: 'CREATIVE_TYPE',
    AgeBucketAndGender: 'AGE_BUCKET_AND_GENDER',
    AudienceMultiplier: 'AUDIENCE_MULTIPLIER'
} as const;
export type AdsAnalyticsCampaignTargetingType = typeof AdsAnalyticsCampaignTargetingType[keyof typeof AdsAnalyticsCampaignTargetingType];

