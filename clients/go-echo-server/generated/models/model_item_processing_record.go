package models

// ItemProcessingRecord - Object describing an item processing record
type ItemProcessingRecord struct {

	// The catalog item id in the merchant namespace
	ItemId string `json:"item_id,omitempty"`

	// Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
	Errors []ItemValidationEvent `json:"errors,omitempty"`

	// Array with the validation warnings for the item processing record
	Warnings []ItemValidationEvent `json:"warnings,omitempty"`

	Status ItemProcessingStatus `json:"status,omitempty"`
}
