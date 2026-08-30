

/**
 * Campaign objective type. If set as one of [\"AWARENESS\", \"CONSIDERATION\", \"WEB_CONVERSION\", \"CATALOG_SALES\", \"VIDEO_COMPLETION\", \"CTV_CONSIDERATION\"] the campaign is considered as a Campaign Budget Optimization (CBO) campaign, meaning budget needs to be set at the campaign level rather than at the ad group level. [\"WEB_SESSIONS\"] is DEPRECATED. `VIDEO_VIEW` is deprecated; use `VIDEO_COMPLETION` instead. `CTV_CONSIDERATION` is in BETA. For update, only draft campaigns may update objective type.
 */
export const CampaignObjectiveType = {
    Awareness: 'AWARENESS',
    Consideration: 'CONSIDERATION',
    VideoView: 'VIDEO_VIEW',
    WebConversion: 'WEB_CONVERSION',
    CatalogSales: 'CATALOG_SALES',
    WebSessions: 'WEB_SESSIONS',
    VideoCompletion: 'VIDEO_COMPLETION',
    AppInstall: 'APP_INSTALL',
    Sales: 'SALES',
    Leads: 'LEADS',
    CtvConsideration: 'CTV_CONSIDERATION'
} as const;
export type CampaignObjectiveType = typeof CampaignObjectiveType[keyof typeof CampaignObjectiveType];

