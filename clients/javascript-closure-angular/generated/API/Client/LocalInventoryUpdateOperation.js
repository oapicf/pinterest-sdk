goog.provide('API.Client.LocalInventoryUpdateOperation');

/**
 * Update operation for local inventory item
 * @record
 */
API.Client.LocalInventoryUpdateOperation = function() {}

/**
 * @type {!API.Client.RetailLocalInventoryItemAttributesOptional}
 * @export
 */
API.Client.LocalInventoryUpdateOperation.prototype.attributes;

/**
 * Catalog item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.LocalInventoryUpdateOperation.prototype.itemId;

/**
 * @type {!string}
 * @export
 */
API.Client.LocalInventoryUpdateOperation.prototype.operation;

/**
 * Store code for the local inventory item
 * @type {!string}
 * @export
 */
API.Client.LocalInventoryUpdateOperation.prototype.storeCode;

/** @enum {string} */
API.Client.LocalInventoryUpdateOperation.OperationEnum = { 
  UPDATE: 'UPDATE',
}
