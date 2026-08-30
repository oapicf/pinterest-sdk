goog.provide('API.Client.LocalInventoryCreateOperation');

/**
 * Create operation for local inventory item
 * @record
 */
API.Client.LocalInventoryCreateOperation = function() {}

/**
 * @type {!API.Client.RetailLocalInventoryItemAttributes}
 * @export
 */
API.Client.LocalInventoryCreateOperation.prototype.attributes;

/**
 * Catalog item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.LocalInventoryCreateOperation.prototype.itemId;

/**
 * @type {!string}
 * @export
 */
API.Client.LocalInventoryCreateOperation.prototype.operation;

/**
 * Store code for the local inventory item
 * @type {!string}
 * @export
 */
API.Client.LocalInventoryCreateOperation.prototype.storeCode;

/** @enum {string} */
API.Client.LocalInventoryCreateOperation.OperationEnum = { 
  CREATE: 'CREATE',
}
