goog.provide('API.Client.AdvancedAuctionProcessedItems');

/**
 * Response object containing the results of an operation on an item bid option
 * @record
 */
API.Client.AdvancedAuctionProcessedItems = function() {}

/**
 * Catalog id pertaining to all items
 * @type {!string}
 * @export
 */
API.Client.AdvancedAuctionProcessedItems.prototype.catalogId;

/**
 * Array of advanced auction processed items
 * @type {!Array<!API.Client.AdvancedAuctionProcessedItem>}
 * @export
 */
API.Client.AdvancedAuctionProcessedItems.prototype.items;

