package models

// PinMediaSourceVideoId - Video ID-based media source
type PinMediaSourceVideoId struct {

	SourceType string `json:"source_type"`

	// Cover image url.
	CoverImageUrl string `json:"cover_image_url,omitempty"`

	// Content type for cover image Base64.
	CoverImageContentType string `json:"cover_image_content_type,omitempty"`

	// Cover image Base64.
	CoverImageData string `json:"cover_image_data,omitempty"`

	MediaId string `json:"media_id" validate:"regexp=^\\\\d+$"`

	// Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
	IsStandard bool `json:"is_standard,omitempty"`
}
