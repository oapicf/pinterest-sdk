package models

import (
	"gopkg.in/validator.v2"
)

// PinMediaSource - Pin media source.
type PinMediaSource struct {

	SourceType string `json:"source_type"`

	ContentType string `json:"content_type"`

	Data string `json:"data"`

	// Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
	IsStandard bool `json:"is_standard,omitempty"`

	Url string `json:"url"`

	// Cover image url.
	CoverImageUrl string `json:"cover_image_url,omitempty"`

	// Content type for cover image Base64.
	CoverImageContentType string `json:"cover_image_content_type,omitempty"`

	// Cover image Base64.
	CoverImageData string `json:"cover_image_data,omitempty"`

	MediaId string `json:"media_id"`

	// Array with image objects.
	Items []PinMediaSourceImagesUrlItemsInner `json:"items"`

	Index int32 `json:"index,omitempty"`

	// This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
	IsAffiliateLink bool `json:"is_affiliate_link,omitempty"`
}
