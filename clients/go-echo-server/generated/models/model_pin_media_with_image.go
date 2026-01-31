package models

// PinMediaWithImage - Pin with image.
type PinMediaWithImage struct {

	Images ImageSize `json:"images,omitempty"`

	MediaType string `json:"media_type"`
}
