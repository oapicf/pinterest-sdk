

/**
 * Order Line Paid Type
 */
export const OrderLinePaidType = {
    Paid: 'PAID',
    Bonus: 'BONUS',
    MakeGood: 'MAKE_GOOD',
    Test: 'TEST'
} as const;
export type OrderLinePaidType = typeof OrderLinePaidType[keyof typeof OrderLinePaidType];

