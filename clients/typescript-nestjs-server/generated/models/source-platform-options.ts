

/**
 * List of source platforms for a conversion event.
 */
export const SourcePlatformOptions = {
    Web: 'WEB',
    Mobile: 'MOBILE',
    MobileAndroid: 'MOBILE_ANDROID',
    MobileIos: 'MOBILE_IOS',
    Offline: 'OFFLINE',
    PinterestWeb: 'PINTEREST_WEB',
    PinterestAndroid: 'PINTEREST_ANDROID',
    PinterestIos: 'PINTEREST_IOS',
    PointOfSale: 'POINT_OF_SALE'
} as const;
export type SourcePlatformOptions = typeof SourcePlatformOptions[keyof typeof SourcePlatformOptions];

