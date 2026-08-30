package models

type ImageMetadata struct {

	Description *string `json:"description,omitempty"`

	Images ImageSize `json:"images,omitempty"`

	// Discriminator literal identifying this as image metadata inside a `PinMediaMetadata` payload.
	ItemType string `json:"item_type"`

	Link *string `json:"link,omitempty"`

	Title *string `json:"title,omitempty"`
}
