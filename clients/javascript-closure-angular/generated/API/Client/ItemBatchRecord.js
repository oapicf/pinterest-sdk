goog.provide('API.Client.ItemBatchRecord');

/**
 * Object describing an item batch record
 * @record
 */
API.Client.ItemBatchRecord = function() {}

/**
 * The catalog item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.ItemBatchRecord.prototype.itemId;

/**
 * @type {!API.Client.ItemAttributesRequest}
 * @export
 */
API.Client.ItemBatchRecord.prototype.attributes;

/**
 * The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
 * @type {!Array<!API.Client.UpdateMaskFieldType>}
 * @export
 */
API.Client.ItemBatchRecord.prototype.updateMask;

