

/**
 * Optimization type for ad group delivery estimates. Supported types vary by objective.
 */
export const OptimizationType = {
    Clickthrough: 'CLICKTHROUGH',
    Impression: 'IMPRESSION',
    WebConversion: 'WEB_CONVERSION',
    Roas: 'ROAS',
    OutboundClick: 'OUTBOUND_CLICK'
} as const;
export type OptimizationType = typeof OptimizationType[keyof typeof OptimizationType];

