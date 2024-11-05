package models

import (
	"gopkg.in/validator.v2"
)

// AdvancedAuctionItemsSubmitRecord - Object describing an item bid option operation
type AdvancedAuctionItemsSubmitRecord struct {

	Operation AdvancedAuctionOperation `json:"operation"`

	// The catalog retail item id in the merchant namespace
	ItemId string `json:"item_id"`

	Country Country `json:"country"`

	Language Language `json:"language"`

	BidOptions AdvancedAuctionBidOptions `json:"bid_options"`

	// The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
	UpdateMask *[]UpdateMaskBidOptionField `json:"update_mask"`
}
