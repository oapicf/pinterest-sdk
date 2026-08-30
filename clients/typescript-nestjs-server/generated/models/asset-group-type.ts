

/**
 * Asset group type.
 */
export const AssetGroupType = {
    Brand: 'BRAND',
    LocationOrLanguage: 'LOCATION_OR_LANGUAGE',
    ProductLine: 'PRODUCT_LINE',
    Other: 'OTHER'
} as const;
export type AssetGroupType = typeof AssetGroupType[keyof typeof AssetGroupType];

