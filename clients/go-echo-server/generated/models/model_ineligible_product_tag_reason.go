package models
// IneligibleProductTagReason : Reason why a product pin is ineligible for tagging.
type IneligibleProductTagReason string

// List of IneligibleProductTagReason
const (
	PIN_MISSING IneligibleProductTagReason = "PIN_MISSING"
	PIN_IS_PRIVATE IneligibleProductTagReason = "PIN_IS_PRIVATE"
	PRODUCT_METADATA_MISSING IneligibleProductTagReason = "PRODUCT_METADATA_MISSING"
	PIN_NOT_FROM_VERIFIED_DOMAIN IneligibleProductTagReason = "PIN_NOT_FROM_VERIFIED_DOMAIN"
	PIN_NOT_FROM_SAME_USER_AS_HERO_PIN IneligibleProductTagReason = "PIN_NOT_FROM_SAME_USER_AS_HERO_PIN"
)
