

/**
 * Reporting columns for sync reporting data filter
 */
export const AdsAnalyticsFilterColumn = {
    SpendInDollar: 'SPEND_IN_DOLLAR',
    TotalImpression: 'TOTAL_IMPRESSION'
} as const;
export type AdsAnalyticsFilterColumn = typeof AdsAnalyticsFilterColumn[keyof typeof AdsAnalyticsFilterColumn];

