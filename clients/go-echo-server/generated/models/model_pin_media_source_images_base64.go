package models

// PinMediaSourceImagesBase64 - Multiple Base64-based images media source
type PinMediaSourceImagesBase64 struct {

	Index int32 `json:"index,omitempty"`

	// Array with image objects.
	Items []PinMediaSourceImagesBase64Item `json:"items"`

	// The source type of the media.
	SourceType string `json:"source_type"`
}
