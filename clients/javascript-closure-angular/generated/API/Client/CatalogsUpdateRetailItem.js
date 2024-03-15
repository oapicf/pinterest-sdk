goog.provide('API.Client.CatalogsUpdateRetailItem');

/**
 * An item to be updated
 * @record
 */
API.Client.CatalogsUpdateRetailItem = function() {}

/**
 * The catalog item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.CatalogsUpdateRetailItem.prototype.itemId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsUpdateRetailItem.prototype.operation;

/**
 * @type {!API.Client.UpdatableItemAttributes}
 * @export
 */
API.Client.CatalogsUpdateRetailItem.prototype.attributes;

/**
 * The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
 * @type {!Array<!API.Client.UpdateMaskFieldType>}
 * @export
 */
API.Client.CatalogsUpdateRetailItem.prototype.updateMask;

/** @enum {string} */
API.Client.CatalogsUpdateRetailItem.OperationEnum = { 
  CREATE: 'CREATE',
  UPDATE: 'UPDATE',
  UPSERT: 'UPSERT',
  DELETE: 'DELETE',
}
