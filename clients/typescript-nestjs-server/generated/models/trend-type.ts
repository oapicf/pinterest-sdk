

export const TrendType = {
    Growing: 'growing',
    Monthly: 'monthly',
    Yearly: 'yearly',
    Seasonal: 'seasonal'
} as const;
export type TrendType = typeof TrendType[keyof typeof TrendType];

