goog.provide('API.Client.AdvancedAuctionItemsSubmitDeleteRecord');

/**
 * Object describing an item bid option deletion operation
 * @record
 */
API.Client.AdvancedAuctionItemsSubmitDeleteRecord = function() {}

/**
 * The catalog retail item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.AdvancedAuctionItemsSubmitDeleteRecord.prototype.itemId;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.AdvancedAuctionItemsSubmitDeleteRecord.prototype.country;

/**
 * @type {!API.Client.Language}
 * @export
 */
API.Client.AdvancedAuctionItemsSubmitDeleteRecord.prototype.language;

