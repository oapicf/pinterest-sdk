

/**
 * Report granularity for time-based aggregation: - TOTAL: Metrics are aggregated over the specified date range - WEEK: Metrics are broken down weekly - MONTH: Metrics are broken down monthly
 */
export const ConversionProductReportGranularity = {
    Total: 'TOTAL',
    Week: 'WEEK',
    Month: 'MONTH'
} as const;
export type ConversionProductReportGranularity = typeof ConversionProductReportGranularity[keyof typeof ConversionProductReportGranularity];

