

/**
 * The status of a billing invoice.
 */
export const BillingInvoiceStatus = {
    Open: 'OPEN',
    Closed: 'CLOSED'
} as const;
export type BillingInvoiceStatus = typeof BillingInvoiceStatus[keyof typeof BillingInvoiceStatus];

