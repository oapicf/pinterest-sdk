

export const ProductCategoryDetailLookbackWindow = {
    NUMBER_90: 90,
    NUMBER_180: 180,
    NUMBER_365: 365,
    NUMBER_730: 730
} as const;
export type ProductCategoryDetailLookbackWindow = typeof ProductCategoryDetailLookbackWindow[keyof typeof ProductCategoryDetailLookbackWindow];

