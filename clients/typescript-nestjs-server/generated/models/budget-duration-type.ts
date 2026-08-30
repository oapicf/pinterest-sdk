

/**
 * Budget duration type for delivery estimates.
 */
export const BudgetDurationType = {
    FixedDaily: 'FIXED_DAILY',
    FlexibleDaily: 'FLEXIBLE_DAILY',
    Lifetime: 'LIFETIME'
} as const;
export type BudgetDurationType = typeof BudgetDurationType[keyof typeof BudgetDurationType];

