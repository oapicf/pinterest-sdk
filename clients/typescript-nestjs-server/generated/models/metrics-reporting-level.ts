

/**
 * Level of the reporting request
 */
export const MetricsReportingLevel = {
    Advertiser: 'ADVERTISER',
    AdvertiserTargeting: 'ADVERTISER_TARGETING',
    Campaign: 'CAMPAIGN',
    CampaignTargeting: 'CAMPAIGN_TARGETING',
    AdGroup: 'AD_GROUP',
    AdGroupTargeting: 'AD_GROUP_TARGETING',
    PinPromotion: 'PIN_PROMOTION',
    PinPromotionTargeting: 'PIN_PROMOTION_TARGETING',
    Keyword: 'KEYWORD',
    ProductGroup: 'PRODUCT_GROUP',
    ProductGroupTargeting: 'PRODUCT_GROUP_TARGETING',
    ProductItem: 'PRODUCT_ITEM',
    ProductItemTargeting: 'PRODUCT_ITEM_TARGETING'
} as const;
export type MetricsReportingLevel = typeof MetricsReportingLevel[keyof typeof MetricsReportingLevel];

