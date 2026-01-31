goog.provide('API.Client.CatalogsCreateRetailItem');

/**
 * An item to be created
 * @record
 */
API.Client.CatalogsCreateRetailItem = function() {}

/**
 * @type {!API.Client.ItemAttributesRequest}
 * @export
 */
API.Client.CatalogsCreateRetailItem.prototype.attributes;

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

/** @enum {string} */
API.Client.CatalogsCreateRetailItem.OperationEnum = { 
  CREATE: 'CREATE',
}
