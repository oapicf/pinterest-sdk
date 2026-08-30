

/**
 * Days in lookback window in the GET Conversion EQS response.
 */
export const LookbackPeriodOptions = {
    _1d: '1d',
    _14d: '14d'
} as const;
export type LookbackPeriodOptions = typeof LookbackPeriodOptions[keyof typeof LookbackPeriodOptions];

