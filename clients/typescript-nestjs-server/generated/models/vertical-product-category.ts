

/**
 * List of verticals for product categories.
 */
export const VerticalProductCategory = {
    Fashion: 'FASHION',
    HomeDecor: 'HOME_DECOR',
    Beauty: 'BEAUTY'
} as const;
export type VerticalProductCategory = typeof VerticalProductCategory[keyof typeof VerticalProductCategory];

