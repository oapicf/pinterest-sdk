package models

// AdvancedAuctionItemsSubmitDeleteRecord - Object describing an item bid option deletion operation
type AdvancedAuctionItemsSubmitDeleteRecord struct {

	// The catalog retail item id in the merchant namespace
	ItemId string `json:"item_id"`

	Country Country `json:"country"`

	Language Language `json:"language"`
}
