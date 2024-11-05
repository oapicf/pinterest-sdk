package models

// AdvancedAuctionItemsSubmitRequest - Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items
type AdvancedAuctionItemsSubmitRequest struct {

	// Catalog id pertaining to all items
	CatalogId string `json:"catalog_id" validate:"regexp=^\\\\d+$"`

	// Array of item bid option operations
	Items []AdvancedAuctionItemsSubmitRecord `json:"items"`
}
