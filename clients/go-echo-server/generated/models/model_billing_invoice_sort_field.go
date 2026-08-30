package models
// BillingInvoiceSortField : Field by which to sort billing invoices.
type BillingInvoiceSortField string

// List of BillingInvoiceSortField
const (
	DUE_DATE BillingInvoiceSortField = "DUE_DATE"
	BILLING_PERIOD BillingInvoiceSortField = "BILLING_PERIOD"
	DOCUMENT_TYPE BillingInvoiceSortField = "DOCUMENT_TYPE"
	TOTAL_AMOUNT BillingInvoiceSortField = "TOTAL_AMOUNT"
	INVOICE_NUMBER BillingInvoiceSortField = "INVOICE_NUMBER"
)
