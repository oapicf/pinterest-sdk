goog.provide('API.Client.LocalInventoryDeleteOperation');

/**
 * Delete operation for local inventory item
 * @record
 */
API.Client.LocalInventoryDeleteOperation = function() {}

/**
 * Catalog item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.LocalInventoryDeleteOperation.prototype.itemId;

/**
 * @type {!string}
 * @export
 */
API.Client.LocalInventoryDeleteOperation.prototype.operation;

/**
 * Store code for the local inventory item
 * @type {!string}
 * @export
 */
API.Client.LocalInventoryDeleteOperation.prototype.storeCode;

/** @enum {string} */
API.Client.LocalInventoryDeleteOperation.OperationEnum = { 
  DELETE: 'DELETE',
}
