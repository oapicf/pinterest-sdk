goog.provide('API.Client.AdvancedAuctionItems');

/**
 * Response object containing item bid options
 * @record
 */
API.Client.AdvancedAuctionItems = function() {}

/**
 * Response object of item bid options
 * @type {!string}
 * @export
 */
API.Client.AdvancedAuctionItems.prototype.catalogId;

/**
 * Array with item bid options
 * @type {!Array<!API.Client.AdvancedAuctionItem>}
 * @export
 */
API.Client.AdvancedAuctionItems.prototype.items;

