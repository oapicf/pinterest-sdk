package models

// PinMediaWithImages - Pin with multiple images.
type PinMediaWithImages struct {

	Items []ImageMetadata `json:"items,omitempty"`
}
