goog.provide('API.Client.ItemUpdateBatchRecord');

/**
 * Object describing an item batch record to update items
 * @record
 */
API.Client.ItemUpdateBatchRecord = function() {}

/**
 * The catalog item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.ItemUpdateBatchRecord.prototype.itemId;

/**
 * @type {!API.Client.UpdatableItemAttributes}
 * @export
 */
API.Client.ItemUpdateBatchRecord.prototype.attributes;

/**
 * The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
 * @type {!Array<!API.Client.UpdateMaskFieldType>}
 * @export
 */
API.Client.ItemUpdateBatchRecord.prototype.updateMask;

