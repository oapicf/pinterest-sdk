goog.provide('API.Client.AdvancedAuctionBidOptions');

/**
 * Object describing a retail catalog item's bid options (bid price and bid multipliers).
 * @record
 */
API.Client.AdvancedAuctionBidOptions = function() {}

/**
 * Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group's `bid_in_micro_currency`.
 * @type {!number}
 * @export
 */
API.Client.AdvancedAuctionBidOptions.prototype.bidInMicroCurrency;

/**
 * @type {!API.Client.AppTypeMultipliers}
 * @export
 */
API.Client.AdvancedAuctionBidOptions.prototype.appTypeMultipliers;

/**
 * @type {!API.Client.PlacementMultipliers}
 * @export
 */
API.Client.AdvancedAuctionBidOptions.prototype.placementMultipliers;

