goog.provide('API.Client.AdvancedAuctionItemsSubmitRequest');

/**
 * Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items
 * @record
 */
API.Client.AdvancedAuctionItemsSubmitRequest = function() {}

/**
 * Catalog id pertaining to all items
 * @type {!string}
 * @export
 */
API.Client.AdvancedAuctionItemsSubmitRequest.prototype.catalogId;

/**
 * Array of item bid option operations
 * @type {!Array<!API.Client.AdvancedAuctionItemsSubmitRecord>}
 * @export
 */
API.Client.AdvancedAuctionItemsSubmitRequest.prototype.items;

