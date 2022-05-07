package models

type CatalogsFeedIngestionInfo struct {

	InStock int32 `json:"in_stock,omitempty"`

	OutOfStock int32 `json:"out_of_stock,omitempty"`

	Preorder int32 `json:"preorder,omitempty"`
}
