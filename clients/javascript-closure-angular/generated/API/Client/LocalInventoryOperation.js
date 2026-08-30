goog.provide('API.Client.LocalInventoryOperation');

/**
 * @record
 */
API.Client.LocalInventoryOperation = function() {}

/**
 * @type {!API.Client.RetailLocalInventoryItemAttributes}
 * @export
 */
API.Client.LocalInventoryOperation.prototype.attributes;

/**
 * Catalog item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.LocalInventoryOperation.prototype.itemId;

/**
 * @type {!string}
 * @export
 */
API.Client.LocalInventoryOperation.prototype.operation;

/**
 * Store code for the local inventory item
 * @type {!string}
 * @export
 */
API.Client.LocalInventoryOperation.prototype.storeCode;

/** @enum {string} */
API.Client.LocalInventoryOperation.OperationEnum = { 
  DELETE: 'DELETE',
}
