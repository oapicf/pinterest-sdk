

/**
 * Field by which to sort billing invoices.
 */
export const BillingInvoiceSortField = {
    DueDate: 'DUE_DATE',
    BillingPeriod: 'BILLING_PERIOD',
    DocumentType: 'DOCUMENT_TYPE',
    TotalAmount: 'TOTAL_AMOUNT',
    InvoiceNumber: 'INVOICE_NUMBER'
} as const;
export type BillingInvoiceSortField = typeof BillingInvoiceSortField[keyof typeof BillingInvoiceSortField];

