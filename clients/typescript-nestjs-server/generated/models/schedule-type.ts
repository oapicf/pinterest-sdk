

/**
 * The schedule type
 */
export const ScheduleType = {
    CampaignBudgetChange: 'CAMPAIGN_BUDGET_CHANGE',
    CampaignBidMultipliers: 'CAMPAIGN_BID_MULTIPLIERS'
} as const;
export type ScheduleType = typeof ScheduleType[keyof typeof ScheduleType];

