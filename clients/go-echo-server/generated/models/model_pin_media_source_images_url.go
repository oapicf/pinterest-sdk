package models

// PinMediaSourceImagesUrl - Multiple images urls-based media source
type PinMediaSourceImagesUrl struct {

	SourceType string `json:"source_type,omitempty"`

	// Array with image objects.
	Items []PinMediaSourceImagesUrlItemsInner `json:"items"`

	Index int32 `json:"index,omitempty"`
}
