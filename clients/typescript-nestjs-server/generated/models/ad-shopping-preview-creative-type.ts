

export const AdShoppingPreviewCreativeType = {
    Shopping: 'SHOPPING',
    Collection: 'COLLECTION',
    Carousel: 'CAROUSEL',
    MaxWidthCollection: 'MAX_WIDTH_COLLECTION'
} as const;
export type AdShoppingPreviewCreativeType = typeof AdShoppingPreviewCreativeType[keyof typeof AdShoppingPreviewCreativeType];

