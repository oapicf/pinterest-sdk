package models

type CatalogsProduct struct {

	Metadata CatalogsProductMetadata `json:"metadata"`

	Pin *Pin `json:"pin"`
}
