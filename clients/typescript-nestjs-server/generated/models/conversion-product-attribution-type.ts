

/**
 * Conversion product attribution level
 */
export const ConversionProductAttributionType = {
    Default: 'DEFAULT',
    BrandAttribution: 'BRAND_ATTRIBUTION'
} as const;
export type ConversionProductAttributionType = typeof ConversionProductAttributionType[keyof typeof ConversionProductAttributionType];

