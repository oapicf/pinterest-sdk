package models

// AdvancedAuctionItemsGetRecord - Object uniquely identifying a retail catalog item
type AdvancedAuctionItemsGetRecord struct {

	Country Country `json:"country"`

	// The catalog retail item id in the merchant namespace
	ItemId string `json:"item_id"`

	Language Language `json:"language"`
}
