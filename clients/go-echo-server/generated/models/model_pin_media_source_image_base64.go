package models

// PinMediaSourceImageBase64 - Base64-encoded image media source
type PinMediaSourceImageBase64 struct {

	SourceType string `json:"source_type"`

	ContentType string `json:"content_type"`

	Data string `json:"data" validate:"regexp=[a-zA-Z0-9+\\/=]+"`

	// Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
	IsStandard bool `json:"is_standard,omitempty"`
}
