

/**
 * Estimation type for campaign planning estimated curve
 */
export const CampaignPlanningEstimationType = {
    Impression: 'IMPRESSION',
    Click: 'CLICK',
    Conversion: 'CONVERSION',
    WeeklyFrequency: 'WEEKLY_FREQUENCY',
    WeeklyReach: 'WEEKLY_REACH',
    LifetimeFrequency: 'LIFETIME_FREQUENCY',
    LifetimeReach: 'LIFETIME_REACH',
    Cpm: 'CPM',
    Cpc: 'CPC',
    Cpa: 'CPA'
} as const;
export type CampaignPlanningEstimationType = typeof CampaignPlanningEstimationType[keyof typeof CampaignPlanningEstimationType];

