

/**
 * Match type for an attributed event. P for probabilistic, D for deterministic, NA for Not applicable.
 */
export const AttributionMatchType = {
    P: 'P',
    D: 'D',
    Na: 'NA'
} as const;
export type AttributionMatchType = typeof AttributionMatchType[keyof typeof AttributionMatchType];

