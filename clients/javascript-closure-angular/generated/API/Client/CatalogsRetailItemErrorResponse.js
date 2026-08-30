goog.provide('API.Client.CatalogsRetailItemErrorResponse');

/**
 * Object describing a retail item error
 * @record
 */
API.Client.CatalogsRetailItemErrorResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailItemErrorResponse.prototype.catalogType;

/**
 * Array with the errors for the item id requested
 * @type {!Array<!API.Client.ItemValidationEvent>}
 * @export
 */
API.Client.CatalogsRetailItemErrorResponse.prototype.errors;

/**
 * The catalog item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailItemErrorResponse.prototype.itemId;

/**
 * Discriminator literal identifying this leaf inside an `ItemResponse` payload.
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailItemErrorResponse.prototype.itemResponseKind;

/** @enum {string} */
API.Client.CatalogsRetailItemErrorResponse.CatalogTypeEnum = { 
  RETAIL: 'RETAIL',
}
/** @enum {string} */
API.Client.CatalogsRetailItemErrorResponse.ItemResponseKindEnum = { 
  retail_item_error: 'retail_item_error',
}
