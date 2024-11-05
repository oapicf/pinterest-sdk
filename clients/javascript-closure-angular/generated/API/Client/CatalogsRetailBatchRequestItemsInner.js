goog.provide('API.Client.CatalogsRetailBatchRequest_items_inner');

/**
 * @record
 */
API.Client.CatalogsRetailBatchRequestItemsInner = function() {}

/**
 * The catalog item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailBatchRequestItemsInner.prototype.itemId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailBatchRequestItemsInner.prototype.operation;

/**
 * @type {!API.Client.ItemAttributesRequest}
 * @export
 */
API.Client.CatalogsRetailBatchRequestItemsInner.prototype.attributes;

/**
 * The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
 * @type {!Array<!API.Client.UpdateMaskFieldType>}
 * @export
 */
API.Client.CatalogsRetailBatchRequestItemsInner.prototype.updateMask;

/** @enum {string} */
API.Client.CatalogsRetailBatchRequestItemsInner.OperationEnum = { 
  DELETE: 'DELETE',
}
