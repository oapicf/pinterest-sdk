

/**
 * Objective for engagement audience filter. Used only on ad account audience rule; matches baseline ObjectiveType (no VIDEO_VIEW, WEB_SESSIONS).
 */
export const AudienceObjectiveType = {
    Awareness: 'AWARENESS',
    Consideration: 'CONSIDERATION',
    WebConversion: 'WEB_CONVERSION',
    CatalogSales: 'CATALOG_SALES',
    VideoCompletion: 'VIDEO_COMPLETION',
    Sales: 'SALES'
} as const;
export type AudienceObjectiveType = typeof AudienceObjectiveType[keyof typeof AudienceObjectiveType];

