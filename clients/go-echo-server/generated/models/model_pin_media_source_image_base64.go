package models

// PinMediaSourceImageBase64 - Base64-encoded image media source
type PinMediaSourceImageBase64 struct {

	SourceType string `json:"source_type"`

	ContentType string `json:"content_type"`

	Data string `json:"data"`
}
