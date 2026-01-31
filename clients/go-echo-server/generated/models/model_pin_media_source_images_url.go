package models

// PinMediaSourceImagesUrl - Multiple URL-based images media source
type PinMediaSourceImagesUrl struct {

	Index int32 `json:"index,omitempty"`

	// Array with image objects.
	Items []PinMediaSourceImagesUrlItem `json:"items"`

	// The source type of the media.
	SourceType string `json:"source_type"`
}
