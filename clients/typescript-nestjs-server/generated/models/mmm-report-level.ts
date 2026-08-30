

export const MMMReportLevel = {
    CampaignTargeting: 'CAMPAIGN_TARGETING',
    AdGroupTargeting: 'AD_GROUP_TARGETING'
} as const;
export type MMMReportLevel = typeof MMMReportLevel[keyof typeof MMMReportLevel];

