goog.provide('API.Client.CatalogsCreateRetailItem');

/**
 * An item to be created
 * @record
 */
API.Client.CatalogsCreateRetailItem = function() {}

/**
 * The catalog item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreateRetailItem.prototype.itemId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreateRetailItem.prototype.operation;

/**
 * @type {!API.Client.ItemAttributes}
 * @export
 */
API.Client.CatalogsCreateRetailItem.prototype.attributes;

/** @enum {string} */
API.Client.CatalogsCreateRetailItem.OperationEnum = { 
  CREATE: 'CREATE',
  UPDATE: 'UPDATE',
  UPSERT: 'UPSERT',
  DELETE: 'DELETE',
}
