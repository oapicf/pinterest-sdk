

/**
 * Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
 */
export const AssetTypeResponse = {
    AdAccount: 'AD_ACCOUNT',
    Merchant: 'MERCHANT',
    Profile: 'PROFILE',
    AssetGroup: 'ASSET_GROUP',
    PinnerList: 'PINNER_LIST',
    ConversionTag: 'CONVERSION_TAG',
    Catalog: 'CATALOG',
    ConversionSegment: 'CONVERSION_SEGMENT'
} as const;
export type AssetTypeResponse = typeof AssetTypeResponse[keyof typeof AssetTypeResponse];

