goog.provide('API.Client.ItemCreateBatchRecord');

/**
 * Object describing an item batch record to create items
 * @record
 */
API.Client.ItemCreateBatchRecord = function() {}

/**
 * The catalog item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.ItemCreateBatchRecord.prototype.itemId;

/**
 * @type {!API.Client.ItemAttributes}
 * @export
 */
API.Client.ItemCreateBatchRecord.prototype.attributes;

