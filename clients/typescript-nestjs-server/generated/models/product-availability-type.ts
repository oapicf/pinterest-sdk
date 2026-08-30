

/**
 * Default availability for products in a feed.
 */
export const ProductAvailabilityType = {
    InStock: 'IN_STOCK',
    OutOfStock: 'OUT_OF_STOCK',
    Preorder: 'PREORDER'
} as const;
export type ProductAvailabilityType = typeof ProductAvailabilityType[keyof typeof ProductAvailabilityType];

