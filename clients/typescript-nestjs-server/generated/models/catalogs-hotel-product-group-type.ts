

/**
 * Catalog hotel product group type
 */
export const CatalogsHotelProductGroupType = {
    MerchantCreated: 'MERCHANT_CREATED',
    AllListings: 'ALL_LISTINGS'
} as const;
export type CatalogsHotelProductGroupType = typeof CatalogsHotelProductGroupType[keyof typeof CatalogsHotelProductGroupType];

