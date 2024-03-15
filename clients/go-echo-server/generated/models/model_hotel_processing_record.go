package models

// HotelProcessingRecord - Object describing an item processing record
type HotelProcessingRecord struct {

	// The catalog hotel id in the merchant namespace
	HotelId string `json:"hotel_id,omitempty"`

	// Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
	Errors []ItemValidationEvent `json:"errors,omitempty"`

	// Array with the validation warnings for the item processing record
	Warnings []ItemValidationEvent `json:"warnings,omitempty"`

	Status ItemProcessingStatus `json:"status,omitempty"`
}
