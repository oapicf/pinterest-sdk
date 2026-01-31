package models

// ImageBase64 - Base64-encoded image media source
type ImageBase64 struct {

	ContentType string `json:"content_type"`

	Data string `json:"data" validate:"regexp=[a-zA-Z0-9+\\/=]+"`
}
