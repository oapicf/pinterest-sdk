goog.provide('API.Client.CatalogsDeleteRetailItem');

/**
 * An item to be deleted
 * @record
 */
API.Client.CatalogsDeleteRetailItem = function() {}

/**
 * The catalog item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.CatalogsDeleteRetailItem.prototype.itemId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsDeleteRetailItem.prototype.operation;

/** @enum {string} */
API.Client.CatalogsDeleteRetailItem.OperationEnum = { 
  CREATE: 'CREATE',
  UPDATE: 'UPDATE',
  UPSERT: 'UPSERT',
  DELETE: 'DELETE',
}
