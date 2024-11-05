goog.provide('API.Client.ItemUpsertBatchRecord');

/**
 * Object describing an item batch record to upsert items
 * @record
 */
API.Client.ItemUpsertBatchRecord = function() {}

/**
 * The catalog item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.ItemUpsertBatchRecord.prototype.itemId;

/**
 * @type {!API.Client.ItemAttributesRequest}
 * @export
 */
API.Client.ItemUpsertBatchRecord.prototype.attributes;

