package models

// CatalogsRetailProductGroupProductCounts - Product counts for a Retail CatalogsProductGroup
type CatalogsRetailProductGroupProductCounts struct {

	CatalogType string `json:"catalog_type"`

	InStock float32 `json:"in_stock"`

	OutOfStock float32 `json:"out_of_stock"`

	Preorder float32 `json:"preorder"`

	Total float32 `json:"total"`

	Videos float32 `json:"videos,omitempty"`
}
