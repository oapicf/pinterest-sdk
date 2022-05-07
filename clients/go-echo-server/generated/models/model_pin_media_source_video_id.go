package models

// PinMediaSourceVideoId - Video ID-based media source
type PinMediaSourceVideoId struct {

	SourceType string `json:"source_type"`

	CoverImageUrl string `json:"cover_image_url"`

	MediaId string `json:"media_id"`
}
