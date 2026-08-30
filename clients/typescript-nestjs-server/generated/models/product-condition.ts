

export const ProductCondition = {
    New: 'NEW',
    Used: 'USED',
    Refurbished: 'REFURBISHED'
} as const;
export type ProductCondition = typeof ProductCondition[keyof typeof ProductCondition];

