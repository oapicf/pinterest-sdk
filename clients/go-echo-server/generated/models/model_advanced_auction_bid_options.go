package models

// AdvancedAuctionBidOptions - Object describing a retail catalog item's bid options (bid price and bid multipliers).
type AdvancedAuctionBidOptions struct {

	AppTypeMultipliers *AppTypeMultipliers `json:"app_type_multipliers,omitempty"`

	// Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group's `bid_in_micro_currency`.
	BidInMicroCurrency *int64 `json:"bid_in_micro_currency,omitempty"`

	PlacementMultipliers *PlacementMultipliers `json:"placement_multipliers,omitempty"`
}
