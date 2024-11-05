package models

import (
	"gopkg.in/validator.v2"
)

// CatalogsProductGroupProductCountsVertical - Product counts for a CatalogsProductGroup
type CatalogsProductGroupProductCountsVertical struct {

	CatalogType CatalogsType `json:"catalog_type"`

	InStock float32 `json:"in_stock"`

	OutOfStock float32 `json:"out_of_stock"`

	Preorder float32 `json:"preorder"`

	Total float32 `json:"total"`

	Videos float32 `json:"videos"`
}
