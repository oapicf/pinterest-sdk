

/**
 * Type of the catalog entity.
 */
export const CatalogsType = {
    Retail: 'RETAIL',
    Hotel: 'HOTEL',
    CreativeAssets: 'CREATIVE_ASSETS'
} as const;
export type CatalogsType = typeof CatalogsType[keyof typeof CatalogsType];

