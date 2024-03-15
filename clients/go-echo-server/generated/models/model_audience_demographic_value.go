package models

// AudienceDemographicValue - Demographic detail for a single audience demographic
type AudienceDemographicValue struct {

	// Unique key for demographic item
	Key string `json:"key,omitempty"`

	// Display name for demographic
	Name string `json:"name,omitempty"`

	// Value of demographic item as a percent of total audience
	Ratio float32 `json:"ratio,omitempty"`
}
