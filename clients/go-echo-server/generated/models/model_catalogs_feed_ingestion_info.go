package models

type CatalogsFeedIngestionInfo struct {

	// The number of ingested products that are in stock.
	IN_STOCK int32 `json:"IN_STOCK,omitempty"`

	// The number of ingested products that are in out of stock.
	OUT_OF_STOCK int32 `json:"OUT_OF_STOCK,omitempty"`

	// The number of ingested products that are in preorder.
	PREORDER int32 `json:"PREORDER,omitempty"`
}
