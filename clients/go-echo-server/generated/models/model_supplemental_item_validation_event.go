package models

// SupplementalItemValidationEvent - Item validation event
type SupplementalItemValidationEvent struct {

	// The item attribute referenced by the validation event eg. price, availability, ad_link
	Attribute string `json:"attribute"`

	// The event code that the item validation event references
	Code int32 `json:"code"`

	// Title message describing the item validation event
	Message string `json:"message"`
}
