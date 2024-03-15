package models

// BoardMedia - Board media.
type BoardMedia struct {

	// Board cover image.
	ImageCoverUrl *string `json:"image_cover_url,omitempty"`

	// Board pin thumbnail urls.
	PinThumbnailUrls []string `json:"pin_thumbnail_urls,omitempty"`
}
