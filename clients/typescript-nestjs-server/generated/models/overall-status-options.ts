

/**
 * Overall status of event quality score.
 */
export const OverallStatusOptions = {
    NeedsImprovement: 'NEEDS_IMPROVEMENT',
    Fair: 'FAIR',
    Good: 'GOOD'
} as const;
export type OverallStatusOptions = typeof OverallStatusOptions[keyof typeof OverallStatusOptions];

