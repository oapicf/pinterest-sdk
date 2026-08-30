package models

type AdvancedAuctionItem struct {

	BidOptions AdvancedAuctionBidOptions `json:"bid_options"`

	Country Country `json:"country"`

	// The catalog retail item id in the merchant namespace
	ItemId string `json:"item_id"`

	Language Language `json:"language"`
}
