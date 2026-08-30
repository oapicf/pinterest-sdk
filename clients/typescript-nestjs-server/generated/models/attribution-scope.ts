

/**
 * Ad event type used for attribution.
 */
export const AttributionScope = {
    View: 'view',
    Engagement: 'engagement',
    Click: 'click'
} as const;
export type AttributionScope = typeof AttributionScope[keyof typeof AttributionScope];

