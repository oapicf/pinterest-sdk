goog.provide('API.Client.CatalogsRetailBatchRequestItemsItems');

/**
 * @record
 */
API.Client.CatalogsRetailBatchRequestItemsItems = function() {}

/**
 * @type {!API.Client.ItemAttributesRequest}
 * @export
 */
API.Client.CatalogsRetailBatchRequestItemsItems.prototype.attributes;

/**
 * The catalog item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailBatchRequestItemsItems.prototype.itemId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailBatchRequestItemsItems.prototype.operation;

/**
 * The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
 * @type {!Array<!API.Client.UpdateMaskFieldType>}
 * @export
 */
API.Client.CatalogsRetailBatchRequestItemsItems.prototype.updateMask;

/**
 * The millisecond timestamp when the item was lastly modified by the merchant.
 * @type {!number}
 * @export
 */
API.Client.CatalogsRetailBatchRequestItemsItems.prototype.lastUpdatedTime;

/** @enum {string} */
API.Client.CatalogsRetailBatchRequestItemsItems.OperationEnum = { 
  DELETE: 'DELETE',
}
