goog.provide('API.Client.AdvancedAuctionItemsSubmitDeleteRecord');

/**
 * Object describing an item bid option deletion operation
 * @record
 */
API.Client.AdvancedAuctionItemsSubmitDeleteRecord = function() {}

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.AdvancedAuctionItemsSubmitDeleteRecord.prototype.country;

/**
 * Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
 * @type {!Array<!API.Client.AdvancedAuctionOperationError>}
 * @export
 */
API.Client.AdvancedAuctionItemsSubmitDeleteRecord.prototype.errors;

/**
 * The catalog retail item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.AdvancedAuctionItemsSubmitDeleteRecord.prototype.itemId;

/**
 * @type {!API.Client.Language}
 * @export
 */
API.Client.AdvancedAuctionItemsSubmitDeleteRecord.prototype.language;

/**
 * @type {!string}
 * @export
 */
API.Client.AdvancedAuctionItemsSubmitDeleteRecord.prototype.operation;

/** @enum {string} */
API.Client.AdvancedAuctionItemsSubmitDeleteRecord.OperationEnum = { 
  DELETE: 'DELETE',
}
