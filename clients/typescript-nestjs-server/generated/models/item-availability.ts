

/**
 * Availability of the item
 */
export const ItemAvailability = {
    InStock: 'in stock',
    OutOfStock: 'out of stock',
    Preorder: 'preorder'
} as const;
export type ItemAvailability = typeof ItemAvailability[keyof typeof ItemAvailability];

