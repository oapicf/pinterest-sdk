

/**
 * Level of the report
 */
export const ConversionProductReportLevel = {
    Advertiser: 'ADVERTISER',
    Campaign: 'CAMPAIGN',
    AdGroup: 'AD_GROUP'
} as const;
export type ConversionProductReportLevel = typeof ConversionProductReportLevel[keyof typeof ConversionProductReportLevel];

