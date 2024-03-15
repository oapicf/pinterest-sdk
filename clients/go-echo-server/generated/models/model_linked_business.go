package models

type LinkedBusiness struct {

	// Username
	Username string `json:"username,omitempty"`

	// image_small_url
	ImageSmallUrl string `json:"image_small_url,omitempty"`

	// image_medium_url
	ImageMediumUrl string `json:"image_medium_url,omitempty"`

	// image_large_url
	ImageLargeUrl string `json:"image_large_url,omitempty"`

	// image_xlarge_url
	ImageXlargeUrl string `json:"image_xlarge_url,omitempty"`
}
