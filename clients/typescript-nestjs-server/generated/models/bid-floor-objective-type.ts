

/**
 * Intended result of the campaign. You can only update objectives for draft campaigns. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter.
 */
export const BidFloorObjectiveType = {
    Awareness: 'AWARENESS',
    Consideration: 'CONSIDERATION',
    WebConversion: 'WEB_CONVERSION',
    CatalogSales: 'CATALOG_SALES',
    VideoCompletion: 'VIDEO_COMPLETION',
    Sales: 'SALES'
} as const;
export type BidFloorObjectiveType = typeof BidFloorObjectiveType[keyof typeof BidFloorObjectiveType];

