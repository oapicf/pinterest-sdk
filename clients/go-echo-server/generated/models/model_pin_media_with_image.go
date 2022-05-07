package models

// PinMediaWithImage - Pin with image.
type PinMediaWithImage struct {

	Images map[string]ImageDetails `json:"images,omitempty"`
}
