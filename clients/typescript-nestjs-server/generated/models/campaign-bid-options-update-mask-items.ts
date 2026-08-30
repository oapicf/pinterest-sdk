

/**
 * Fields that can be updated in campaign bid options.
 */
export const CampaignBidOptionsUpdateMaskItems = {
    Audience: 'AUDIENCE',
    AppType: 'APP_TYPE',
    Placement: 'PLACEMENT',
    Gender: 'GENDER',
    AgeBucket: 'AGE_BUCKET',
    Frequency: 'FREQUENCY'
} as const;
export type CampaignBidOptionsUpdateMaskItems = typeof CampaignBidOptionsUpdateMaskItems[keyof typeof CampaignBidOptionsUpdateMaskItems];

