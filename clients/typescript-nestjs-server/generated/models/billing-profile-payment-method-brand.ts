

/**
 * Brand of the payment method.
 */
export const BillingProfilePaymentMethodBrand = {
    Unknown: 'UNKNOWN',
    Visa: 'VISA',
    Mastercard: 'MASTERCARD',
    AmericanExpress: 'AMERICAN_EXPRESS',
    Discover: 'DISCOVER',
    Sofort: 'SOFORT',
    DinersClub: 'DINERS_CLUB',
    Elo: 'ELO',
    CarteBancaire: 'CARTE_BANCAIRE'
} as const;
export type BillingProfilePaymentMethodBrand = typeof BillingProfilePaymentMethodBrand[keyof typeof BillingProfilePaymentMethodBrand];

