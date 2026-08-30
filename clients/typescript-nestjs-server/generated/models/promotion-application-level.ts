

/**
 * Specify if the promotion is applied at ad group or item level.
 */
export const PromotionApplicationLevel = {
    None: 'NONE',
    Item: 'ITEM',
    AdGroup: 'AD_GROUP'
} as const;
export type PromotionApplicationLevel = typeof PromotionApplicationLevel[keyof typeof PromotionApplicationLevel];

