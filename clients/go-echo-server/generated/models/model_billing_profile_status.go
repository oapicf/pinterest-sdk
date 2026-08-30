package models
// BillingProfileStatus : Billing profile status
type BillingProfileStatus string

// List of BillingProfileStatus
const (
	UNSPECIFIED BillingProfileStatus = "UNSPECIFIED"
	VALID BillingProfileStatus = "VALID"
	INVALID BillingProfileStatus = "INVALID"
	PENDING BillingProfileStatus = "PENDING"
	DELETED BillingProfileStatus = "DELETED"
	SECONDARY BillingProfileStatus = "SECONDARY"
	PENDING_SECONDARY BillingProfileStatus = "PENDING_SECONDARY"
)
