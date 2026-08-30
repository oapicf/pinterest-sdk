package models

// AdvancedAuctionItemsSubmitRecord - Object describing an item bid option operation
type AdvancedAuctionItemsSubmitRecord struct {

	BidOptions AdvancedAuctionBidOptions `json:"bid_options"`

	Country Country `json:"country"`

	// Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
	Errors []AdvancedAuctionOperationError `json:"errors,omitempty"`

	// The catalog retail item id in the merchant namespace
	ItemId string `json:"item_id"`

	Language Language `json:"language"`

	Operation string `json:"operation"`

	// The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
	UpdateMask *[]UpdateMaskBidOptionField `json:"update_mask"`
}
