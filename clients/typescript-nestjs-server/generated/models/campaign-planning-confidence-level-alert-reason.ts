

/**
 * Reason for a confidence level alert on delivery estimates.
 */
export const CampaignPlanningConfidenceLevelAlertReason = {
    Unknown: 'UNKNOWN',
    Other: 'OTHER',
    AdvertiserHasNoRecentCampaigns: 'ADVERTISER_HAS_NO_RECENT_CAMPAIGNS',
    AdvertiserHasNoRecentConversions: 'ADVERTISER_HAS_NO_RECENT_CONVERSIONS'
} as const;
export type CampaignPlanningConfidenceLevelAlertReason = typeof CampaignPlanningConfidenceLevelAlertReason[keyof typeof CampaignPlanningConfidenceLevelAlertReason];

