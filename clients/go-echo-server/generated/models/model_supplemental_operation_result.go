package models

// SupplementalOperationResult - Result of a supplemental item operation, discriminated by supplemental_type
type SupplementalOperationResult struct {

	// Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
	Errors []SupplementalItemValidationEvent `json:"errors,omitempty"`

	// Catalog item id in the merchant namespace
	ItemId string `json:"item_id"`

	// Status of the item processing record
	Status SupplementalItemProcessingStatus `json:"status"`

	// Store code for the local inventory item
	StoreCode string `json:"store_code"`

	SupplementalType string `json:"supplemental_type"`

	// Array with the validation warnings for the item processing record
	Warnings []SupplementalItemValidationEvent `json:"warnings,omitempty"`
}
