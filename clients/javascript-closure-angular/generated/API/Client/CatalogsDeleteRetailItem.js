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
 * The millisecond timestamp when the item was lastly modified by the merchant.
 * @type {!number}
 * @export
 */
API.Client.CatalogsDeleteRetailItem.prototype.lastUpdatedTime;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsDeleteRetailItem.prototype.operation;

/** @enum {string} */
API.Client.CatalogsDeleteRetailItem.OperationEnum = { 
  DELETE: 'DELETE',
}
