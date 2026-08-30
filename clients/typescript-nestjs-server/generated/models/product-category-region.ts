

export const ProductCategoryRegion = {
    Us: 'US',
    Gbie: 'GB+IE',
    Ca: 'CA'
} as const;
export type ProductCategoryRegion = typeof ProductCategoryRegion[keyof typeof ProductCategoryRegion];

