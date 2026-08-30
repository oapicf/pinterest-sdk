package models

// IneligibleProductTagErrorItem - Error item for a product tag that failed eligibility check.
type IneligibleProductTagErrorItem struct {

	// Reason why the pin is ineligible for tagging.
	ErrorMessage IneligibleProductTagReason `json:"error_message"`

	// Pin ID that failed eligibility check.
	PinId string `json:"pin_id" validate:"regexp=^\\d+$"`
}
