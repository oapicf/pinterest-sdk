package models

type ImageMetadata struct {

	ItemType string `json:"item_type,omitempty"`

	Title *string `json:"title,omitempty"`

	Description *string `json:"description,omitempty"`

	Link *string `json:"link,omitempty"`

	Images ImageMetadataImages `json:"images,omitempty"`
}
