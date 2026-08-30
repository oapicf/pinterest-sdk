

/**
 * Collections ad header type
 */
export const CollectionsHeaderType = {
    ShopThisCollection: 'SHOP_THIS_COLLECTION',
    ExploreThisCollection: 'EXPLORE_THIS_COLLECTION',
    NoHeader: 'NO_HEADER',
    OnSale: 'ON_SALE',
    GetDeal: 'GET_DEAL'
} as const;
export type CollectionsHeaderType = typeof CollectionsHeaderType[keyof typeof CollectionsHeaderType];

