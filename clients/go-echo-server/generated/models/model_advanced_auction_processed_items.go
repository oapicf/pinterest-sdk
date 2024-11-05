package models

// AdvancedAuctionProcessedItems - Response object containing the results of an operation on an item bid option
type AdvancedAuctionProcessedItems struct {

	// Catalog id pertaining to all items
	CatalogId string `json:"catalog_id,omitempty" validate:"regexp=^\\\\d+$"`

	// Array of advanced auction processed items
	Items []AdvancedAuctionProcessedItem `json:"items,omitempty"`
}
