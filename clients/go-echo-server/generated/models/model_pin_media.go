package models

// PinMedia - Pin media that can be an image, video, or a mix of both.
type PinMedia struct {

	Images ImageSize `json:"images,omitempty"`

	MediaType string `json:"media_type"`

	CoverImageUrl string `json:"cover_image_url,omitempty"`

	// Duration (in miliseconds). Field maybe null after creation due to video processing time.
	Duration *float32 `json:"duration,omitempty"`

	// Height (in pixels). Field maybe null after creation due to video processing time.
	Height *int32 `json:"height,omitempty"`

	// Video url (720p).  **Note:** This field is limited and not available to all apps.
	VideoUrl *string `json:"video_url,omitempty"`

	// Video url (HLS).  **Note:** This field is limited and not available to all apps.
	VideoUrlHls *string `json:"video_url_hls,omitempty"`

	// Width (in pixels). Field maybe null after creation due to video processing time.
	Width *int32 `json:"width,omitempty"`

	Items []PinMediaMetadata `json:"items,omitempty"`
}
