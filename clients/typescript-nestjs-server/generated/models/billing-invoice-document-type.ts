

/**
 * The type of a billing invoice document.
 */
export const BillingInvoiceDocumentType = {
    Invoice: 'INVOICE',
    CreditMemo: 'CREDIT_MEMO'
} as const;
export type BillingInvoiceDocumentType = typeof BillingInvoiceDocumentType[keyof typeof BillingInvoiceDocumentType];

