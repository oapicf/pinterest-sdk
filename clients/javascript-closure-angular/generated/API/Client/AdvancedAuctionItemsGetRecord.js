goog.provide('API.Client.AdvancedAuctionItemsGetRecord');

/**
 * Object uniquely identifying a retail catalog item
 * @record
 */
API.Client.AdvancedAuctionItemsGetRecord = function() {}

/**
 * The catalog retail item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.AdvancedAuctionItemsGetRecord.prototype.itemId;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.AdvancedAuctionItemsGetRecord.prototype.country;

/**
 * @type {!API.Client.Language}
 * @export
 */
API.Client.AdvancedAuctionItemsGetRecord.prototype.language;

