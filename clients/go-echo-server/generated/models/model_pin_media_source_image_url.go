package models

// PinMediaSourceImageUrl - Image URL-based media source
type PinMediaSourceImageUrl struct {

	SourceType string `json:"source_type"`

	Url string `json:"url"`

	// Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
	IsStandard bool `json:"is_standard,omitempty"`
}
