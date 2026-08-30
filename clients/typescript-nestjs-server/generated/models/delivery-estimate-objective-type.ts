

/**
 * Objective type for delivery estimates.
 */
export const DeliveryEstimateObjectiveType = {
    Awareness: 'AWARENESS',
    Consideration: 'CONSIDERATION',
    CatalogSales: 'CATALOG_SALES',
    WebConversion: 'WEB_CONVERSION'
} as const;
export type DeliveryEstimateObjectiveType = typeof DeliveryEstimateObjectiveType[keyof typeof DeliveryEstimateObjectiveType];

