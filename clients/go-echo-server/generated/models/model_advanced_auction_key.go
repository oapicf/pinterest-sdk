package models

// AdvancedAuctionKey - Object uniquely identifying a retail catalog item
type AdvancedAuctionKey struct {

	Country Country `json:"country"`

	// The catalog retail item id in the merchant namespace
	ItemId string `json:"item_id"`

	Language Language `json:"language"`
}
