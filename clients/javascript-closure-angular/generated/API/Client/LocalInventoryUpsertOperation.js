goog.provide('API.Client.LocalInventoryUpsertOperation');

/**
 * Upsert operation for local inventory item
 * @record
 */
API.Client.LocalInventoryUpsertOperation = function() {}

/**
 * @type {!API.Client.RetailLocalInventoryItemAttributes}
 * @export
 */
API.Client.LocalInventoryUpsertOperation.prototype.attributes;

/**
 * Catalog item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.LocalInventoryUpsertOperation.prototype.itemId;

/**
 * @type {!string}
 * @export
 */
API.Client.LocalInventoryUpsertOperation.prototype.operation;

/**
 * Store code for the local inventory item
 * @type {!string}
 * @export
 */
API.Client.LocalInventoryUpsertOperation.prototype.storeCode;

/** @enum {string} */
API.Client.LocalInventoryUpsertOperation.OperationEnum = { 
  UPSERT: 'UPSERT',
}
