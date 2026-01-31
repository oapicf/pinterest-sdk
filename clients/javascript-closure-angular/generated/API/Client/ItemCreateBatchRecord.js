goog.provide('API.Client.ItemCreateBatchRecord');

/**
 * Object describing an item batch record to create items
 * @record
 */
API.Client.ItemCreateBatchRecord = function() {}

/**
 * @type {!API.Client.ItemAttributesRequest}
 * @export
 */
API.Client.ItemCreateBatchRecord.prototype.attributes;

/**
 * The catalog item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.ItemCreateBatchRecord.prototype.itemId;

