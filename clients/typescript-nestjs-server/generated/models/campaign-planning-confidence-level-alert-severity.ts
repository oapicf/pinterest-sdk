

/**
 * Severity of a confidence level alert on delivery estimates.
 */
export const CampaignPlanningConfidenceLevelAlertSeverity = {
    Unknown: 'UNKNOWN',
    LowMild: 'LOW_MILD',
    LowModerate: 'LOW_MODERATE',
    LowSevere: 'LOW_SEVERE'
} as const;
export type CampaignPlanningConfidenceLevelAlertSeverity = typeof CampaignPlanningConfidenceLevelAlertSeverity[keyof typeof CampaignPlanningConfidenceLevelAlertSeverity];

