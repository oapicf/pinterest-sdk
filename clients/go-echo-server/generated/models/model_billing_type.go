package models
// BillingType : Advertisers billing type
type BillingType string

// List of BillingType
const (
	CREDIT_CARD BillingType = "CREDIT_CARD"
	INVOICE BillingType = "INVOICE"
	INTERNAL BillingType = "INTERNAL"
	RECURRING BillingType = "RECURRING"
	PREPAID BillingType = "PREPAID"
)
