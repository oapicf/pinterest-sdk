

/**
 * Advertisers billing type
 */
export const BillingType = {
    CreditCard: 'CREDIT_CARD',
    Invoice: 'INVOICE',
    Internal: 'INTERNAL',
    Recurring: 'RECURRING',
    Prepaid: 'PREPAID'
} as const;
export type BillingType = typeof BillingType[keyof typeof BillingType];

