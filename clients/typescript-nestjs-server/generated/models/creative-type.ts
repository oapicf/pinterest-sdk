

/**
 * Ad creative type enum. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
 */
export const CreativeType = {
    Regular: 'REGULAR',
    Video: 'VIDEO',
    Shopping: 'SHOPPING',
    Carousel: 'CAROUSEL',
    MaxVideo: 'MAX_VIDEO',
    ShopThePin: 'SHOP_THE_PIN',
    Collection: 'COLLECTION',
    Idea: 'IDEA',
    Showcase: 'SHOWCASE',
    Quiz: 'QUIZ',
    Collage: 'COLLAGE',
    MaxWidthRegularCollection: 'MAX_WIDTH_REGULAR_COLLECTION',
    MaxWidthVideoCollection: 'MAX_WIDTH_VIDEO_COLLECTION',
    App: 'APP'
} as const;
export type CreativeType = typeof CreativeType[keyof typeof CreativeType];

