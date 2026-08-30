

export const ConversionProductReportBreakdownType = {
    ProductBrand: 'PRODUCT_BRAND',
    ProductCategory: 'PRODUCT_CATEGORY',
    ProductBrandAndCategory: 'PRODUCT_BRAND_AND_CATEGORY',
    ProductSku: 'PRODUCT_SKU',
    ProductSkuGroup: 'PRODUCT_SKU_GROUP'
} as const;
export type ConversionProductReportBreakdownType = typeof ConversionProductReportBreakdownType[keyof typeof ConversionProductReportBreakdownType];

