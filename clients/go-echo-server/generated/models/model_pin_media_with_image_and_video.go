package models

// PinMediaWithImageAndVideo - Pin with a mix of images and videos.
type PinMediaWithImageAndVideo struct {

	Items []PinMediaMetadata `json:"items,omitempty"`

	MediaType string `json:"media_type"`
}
