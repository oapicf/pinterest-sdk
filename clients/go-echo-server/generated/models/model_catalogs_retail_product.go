package models

type CatalogsRetailProduct struct {

	CatalogType string `json:"catalog_type"`

	Metadata CatalogsRetailProductMetadata `json:"metadata"`

	Pin *Pin `json:"pin"`
}
