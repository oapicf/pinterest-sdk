package models

type CatalogsHotelProduct struct {

	CatalogType string `json:"catalog_type"`

	Metadata CatalogsHotelProductMetadata `json:"metadata"`

	Pin *Pin `json:"pin"`
}
