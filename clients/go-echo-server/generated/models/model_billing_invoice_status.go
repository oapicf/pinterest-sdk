package models
// BillingInvoiceStatus : The status of a billing invoice.
type BillingInvoiceStatus string

// List of BillingInvoiceStatus
const (
	OPEN BillingInvoiceStatus = "OPEN"
	CLOSED BillingInvoiceStatus = "CLOSED"
)
