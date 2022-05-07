package models

// PinMediaSource - Pin media source.
type PinMediaSource struct {

	SourceType string `json:"source_type"`

	ContentType string `json:"content_type"`

	Data string `json:"data"`

	Url string `json:"url"`

	CoverImageUrl string `json:"cover_image_url"`

	MediaId string `json:"media_id"`
}
