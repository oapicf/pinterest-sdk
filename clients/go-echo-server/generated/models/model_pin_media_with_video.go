package models

// PinMediaWithVideo - Pin with video.
type PinMediaWithVideo struct {

	CoverImageUrl string `json:"cover_image_url,omitempty"`

	// Duration (in miliseconds). Field maybe null after creation due to video processing time.
	Duration *float32 `json:"duration,omitempty"`

	// Height (in pixels). Field maybe null after creation due to video processing time.
	Height *int32 `json:"height,omitempty"`

	Images ImageSize `json:"images,omitempty"`

	MediaType string `json:"media_type"`

	// Video url (720p).  **Note:** This field is limited and not available to all apps.
	VideoUrl *string `json:"video_url,omitempty"`

	// Width (in pixels). Field maybe null after creation due to video processing time.
	Width *int32 `json:"width,omitempty"`
}
