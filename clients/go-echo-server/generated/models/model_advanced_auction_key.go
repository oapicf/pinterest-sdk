package models

// AdvancedAuctionKey - Object uniquely identifying a retail catalog item
type AdvancedAuctionKey struct {

	// The catalog retail item id in the merchant namespace
	ItemId string `json:"item_id"`

	Country Country `json:"country"`

	Language Language `json:"language"`
}
