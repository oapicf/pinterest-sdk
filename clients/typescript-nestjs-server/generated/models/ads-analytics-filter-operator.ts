

/**
 * Filter operator for sync reporting
 */
export const AdsAnalyticsFilterOperator = {
    LessThan: 'LESS_THAN',
    GreaterThan: 'GREATER_THAN'
} as const;
export type AdsAnalyticsFilterOperator = typeof AdsAnalyticsFilterOperator[keyof typeof AdsAnalyticsFilterOperator];

