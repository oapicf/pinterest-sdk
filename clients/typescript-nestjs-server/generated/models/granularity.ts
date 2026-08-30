

/**
 * Specifies the time interval at which analytics data is broken down. Determines how metrics are grouped within the requested date range. **Note:** The `HOUR` enum no longer provides data for conversion metrics, but it still returns data for non-conversion metrics. All other enums are unchanged.
 */
export const Granularity = {
    Total: 'TOTAL',
    Day: 'DAY',
    Hour: 'HOUR',
    Week: 'WEEK',
    Month: 'MONTH'
} as const;
export type Granularity = typeof Granularity[keyof typeof Granularity];

