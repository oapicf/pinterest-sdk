

export const AdGroupAudienceSizingCreativeTypes = {
    Regular: 'REGULAR',
    Video: 'VIDEO',
    Shopping: 'SHOPPING',
    Carousel: 'CAROUSEL',
    MaxVideo: 'MAX_VIDEO',
    ShopThePin: 'SHOP_THE_PIN',
    Collection: 'COLLECTION',
    Idea: 'IDEA'
} as const;
export type AdGroupAudienceSizingCreativeTypes = typeof AdGroupAudienceSizingCreativeTypes[keyof typeof AdGroupAudienceSizingCreativeTypes];

