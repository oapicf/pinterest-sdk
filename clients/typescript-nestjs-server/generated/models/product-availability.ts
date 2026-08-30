

/**
 * Product availability.
 */
export const ProductAvailability = {
    InStock: 'IN_STOCK',
    OutOfStock: 'OUT_OF_STOCK',
    Preorder: 'PREORDER'
} as const;
export type ProductAvailability = typeof ProductAvailability[keyof typeof ProductAvailability];

