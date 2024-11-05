package models

type CatalogsCreativeAssetsProduct struct {

	CatalogType string `json:"catalog_type"`

	Metadata CatalogsCreativeAssetsProductMetadata `json:"metadata"`

	Pin *Pin `json:"pin"`
}
