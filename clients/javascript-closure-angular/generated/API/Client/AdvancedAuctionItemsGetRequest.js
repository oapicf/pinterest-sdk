goog.provide('API.Client.AdvancedAuctionItemsGetRequest');

/**
 * Request object used to get bid options values for a batch of retail catalog items
 * @record
 */
API.Client.AdvancedAuctionItemsGetRequest = function() {}

/**
 * Catalog id pertaining to the retail item
 * @type {!string}
 * @export
 */
API.Client.AdvancedAuctionItemsGetRequest.prototype.catalogId;

/**
 * A list of retail catalog items to fetch bid options for
 * @type {!Array<!API.Client.AdvancedAuctionItemsGetRecord>}
 * @export
 */
API.Client.AdvancedAuctionItemsGetRequest.prototype.items;

