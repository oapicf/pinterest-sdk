// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * API version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 */

package openapi




// AdvancedAuctionBidOptions - Object describing a retail catalog item's bid options (bid price and bid multipliers).
type AdvancedAuctionBidOptions struct {

	// Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group's `bid_in_micro_currency`.
	BidInMicroCurrency *int64 `json:"bid_in_micro_currency,omitempty"`

	AppTypeMultipliers *AppTypeMultipliers `json:"app_type_multipliers,omitempty"`

	PlacementMultipliers *PlacementMultipliers `json:"placement_multipliers,omitempty"`
}

// AssertAdvancedAuctionBidOptionsRequired checks if the required fields are not zero-ed
func AssertAdvancedAuctionBidOptionsRequired(obj AdvancedAuctionBidOptions) error {
	return nil
}

// AssertAdvancedAuctionBidOptionsConstraints checks if the values respects the defined constraints
func AssertAdvancedAuctionBidOptionsConstraints(obj AdvancedAuctionBidOptions) error {
	return nil
}
