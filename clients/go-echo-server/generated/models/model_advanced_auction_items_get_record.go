package models

// AdvancedAuctionItemsGetRecord - Object uniquely identifying a retail catalog item
type AdvancedAuctionItemsGetRecord struct {

	// The catalog retail item id in the merchant namespace
	ItemId string `json:"item_id"`

	Country Country `json:"country"`

	Language Language `json:"language"`
}
