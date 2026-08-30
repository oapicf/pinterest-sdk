

/**
 * Advertiser campaign objective type. You can only update objectives for draft campaigns. `CTV_CONSIDERATION` is in BETA. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter.
 */
export const ObjectiveType = {
    Awareness: 'AWARENESS',
    Consideration: 'CONSIDERATION',
    WebConversion: 'WEB_CONVERSION',
    CatalogSales: 'CATALOG_SALES',
    VideoCompletion: 'VIDEO_COMPLETION',
    Sales: 'SALES',
    AppInstall: 'APP_INSTALL',
    CtvConsideration: 'CTV_CONSIDERATION'
} as const;
export type ObjectiveType = typeof ObjectiveType[keyof typeof ObjectiveType];

