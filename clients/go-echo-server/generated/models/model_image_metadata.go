package models

type ImageMetadata struct {

	Description *string `json:"description,omitempty"`

	Images ImageSize `json:"images,omitempty"`

	ItemType string `json:"item_type,omitempty"`

	Link *string `json:"link,omitempty"`

	Title *string `json:"title,omitempty"`
}
