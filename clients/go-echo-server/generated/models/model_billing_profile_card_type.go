package models
// BillingProfileCardType : Type of the credit card.
type BillingProfileCardType string

// List of BillingProfileCardType
const (
	UNKNOWN BillingProfileCardType = "UNKNOWN"
	VISA BillingProfileCardType = "VISA"
	MASTERCARD BillingProfileCardType = "MASTERCARD"
	AMERICAN_EXPRESS BillingProfileCardType = "AMERICAN_EXPRESS"
	DISCOVER BillingProfileCardType = "DISCOVER"
	ELO BillingProfileCardType = "ELO"
)
