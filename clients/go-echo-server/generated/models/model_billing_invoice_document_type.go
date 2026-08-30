package models
// BillingInvoiceDocumentType : The type of a billing invoice document.
type BillingInvoiceDocumentType string

// List of BillingInvoiceDocumentType
const (
	INVOICE BillingInvoiceDocumentType = "INVOICE"
	CREDIT_MEMO BillingInvoiceDocumentType = "CREDIT_MEMO"
)
