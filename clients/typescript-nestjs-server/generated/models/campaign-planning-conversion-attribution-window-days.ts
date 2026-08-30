

/**
 * Conversion attribution window in days.
 */
export const CampaignPlanningConversionAttributionWindowDays = {
    Days0: 'DAYS_0',
    Days1: 'DAYS_1',
    Days7: 'DAYS_7',
    Days30: 'DAYS_30',
    Days60: 'DAYS_60'
} as const;
export type CampaignPlanningConversionAttributionWindowDays = typeof CampaignPlanningConversionAttributionWindowDays[keyof typeof CampaignPlanningConversionAttributionWindowDays];

