

/**
 * Specify the timezone to be applied for the reporting.
 */
export const ReportingTimeZone = {
    PinterestTimeZone: 'PINTEREST_TIME_ZONE',
    AdAccountTimeZone: 'AD_ACCOUNT_TIME_ZONE'
} as const;
export type ReportingTimeZone = typeof ReportingTimeZone[keyof typeof ReportingTimeZone];

