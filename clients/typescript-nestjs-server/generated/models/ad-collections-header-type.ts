

/**
 * Collections ad header type for ads
 */
export const AdCollectionsHeaderType = {
    ShopThisCollection: 'SHOP_THIS_COLLECTION',
    ExploreThisCollection: 'EXPLORE_THIS_COLLECTION',
    NoHeader: 'NO_HEADER'
} as const;
export type AdCollectionsHeaderType = typeof AdCollectionsHeaderType[keyof typeof AdCollectionsHeaderType];

