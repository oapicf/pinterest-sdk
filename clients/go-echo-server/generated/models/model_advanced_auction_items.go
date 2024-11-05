package models

// AdvancedAuctionItems - Response object containing item bid options
type AdvancedAuctionItems struct {

	// Response object of item bid options
	CatalogId string `json:"catalog_id,omitempty" validate:"regexp=^\\\\d+$"`

	// Array with item bid options
	Items []AdvancedAuctionItem `json:"items,omitempty"`
}
