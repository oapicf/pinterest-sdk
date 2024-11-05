goog.provide('API.Client.AdvancedAuctionKey');

/**
 * Object uniquely identifying a retail catalog item
 * @record
 */
API.Client.AdvancedAuctionKey = function() {}

/**
 * The catalog retail item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.AdvancedAuctionKey.prototype.itemId;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.AdvancedAuctionKey.prototype.country;

/**
 * @type {!API.Client.Language}
 * @export
 */
API.Client.AdvancedAuctionKey.prototype.language;

