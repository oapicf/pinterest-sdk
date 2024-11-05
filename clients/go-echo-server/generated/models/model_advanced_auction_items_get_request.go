package models

// AdvancedAuctionItemsGetRequest - Request object used to get bid options values for a batch of retail catalog items
type AdvancedAuctionItemsGetRequest struct {

	// Catalog id pertaining to the retail item
	CatalogId string `json:"catalog_id" validate:"regexp=^\\\\d+$"`

	// A list of retail catalog items to fetch bid options for
	Items []AdvancedAuctionItemsGetRecord `json:"items"`
}
