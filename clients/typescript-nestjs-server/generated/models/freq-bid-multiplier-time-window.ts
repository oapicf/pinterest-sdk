

/**
 * The time window for frequency bid multipliers.
 */
export const FreqBidMultiplierTimeWindow = {
    Week: 'WEEK',
    Month: 'MONTH'
} as const;
export type FreqBidMultiplierTimeWindow = typeof FreqBidMultiplierTimeWindow[keyof typeof FreqBidMultiplierTimeWindow];

