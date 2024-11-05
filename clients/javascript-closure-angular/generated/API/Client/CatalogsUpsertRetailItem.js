goog.provide('API.Client.CatalogsUpsertRetailItem');

/**
 * An item to be upserted
 * @record
 */
API.Client.CatalogsUpsertRetailItem = function() {}

/**
 * The catalog item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.CatalogsUpsertRetailItem.prototype.itemId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsUpsertRetailItem.prototype.operation;

/**
 * @type {!API.Client.ItemAttributesRequest}
 * @export
 */
API.Client.CatalogsUpsertRetailItem.prototype.attributes;

/** @enum {string} */
API.Client.CatalogsUpsertRetailItem.OperationEnum = { 
  UPSERT: 'UPSERT',
}
