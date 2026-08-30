

/**
 * Type of the credit card.
 */
export const BillingProfileCardType = {
    Unknown: 'UNKNOWN',
    Visa: 'VISA',
    Mastercard: 'MASTERCARD',
    AmericanExpress: 'AMERICAN_EXPRESS',
    Discover: 'DISCOVER',
    Elo: 'ELO'
} as const;
export type BillingProfileCardType = typeof BillingProfileCardType[keyof typeof BillingProfileCardType];

