package models

// CatalogsProductGroupProductCounts - Product counts for a CatalogsProductGroup
type CatalogsProductGroupProductCounts struct {

	InStock float32 `json:"in_stock"`

	OutOfStock float32 `json:"out_of_stock"`

	Preorder float32 `json:"preorder"`

	Total float32 `json:"total"`
}
