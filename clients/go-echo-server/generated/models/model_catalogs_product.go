package models

// CatalogsProduct - Catalogs product for all verticals
type CatalogsProduct struct {

	CatalogType CatalogsType `json:"catalog_type"`

	Metadata CatalogsCreativeAssetsProductMetadata `json:"metadata"`

	Pin Pin `json:"pin"`
}
