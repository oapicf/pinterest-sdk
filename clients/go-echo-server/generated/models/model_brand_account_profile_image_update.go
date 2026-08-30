package models

// BrandAccountProfileImageUpdate - Base64-encoded image media source
type BrandAccountProfileImageUpdate struct {

	ContentType string `json:"content_type,omitempty"`

	Data string `json:"data,omitempty" validate:"regexp=[a-zA-Z0-9+/=]+"`
}
