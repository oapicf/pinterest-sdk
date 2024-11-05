goog.provide('API.Client.AdvancedAuctionItem');

/**
 * @record
 */
API.Client.AdvancedAuctionItem = function() {}

/**
 * The catalog retail item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.AdvancedAuctionItem.prototype.itemId;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.AdvancedAuctionItem.prototype.country;

/**
 * @type {!API.Client.Language}
 * @export
 */
API.Client.AdvancedAuctionItem.prototype.language;

/**
 * @type {!API.Client.AdvancedAuctionBidOptions}
 * @export
 */
API.Client.AdvancedAuctionItem.prototype.bidOptions;

