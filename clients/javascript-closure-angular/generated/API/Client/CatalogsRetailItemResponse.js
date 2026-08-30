goog.provide('API.Client.CatalogsRetailItemResponse');

/**
 * Object describing a retail item record
 * @record
 */
API.Client.CatalogsRetailItemResponse = function() {}

/**
 * @type {!API.Client.ItemAttributes}
 * @export
 */
API.Client.CatalogsRetailItemResponse.prototype.attributes;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailItemResponse.prototype.catalogType;

/**
 * The catalog retail item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailItemResponse.prototype.itemId;

/**
 * Discriminator literal identifying this leaf inside an `ItemResponse` payload.
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailItemResponse.prototype.itemResponseKind;

/**
 * The pins mapped to the item
 * @type {!Array<!API.Client.Pin>}
 * @export
 */
API.Client.CatalogsRetailItemResponse.prototype.pins;

/** @enum {string} */
API.Client.CatalogsRetailItemResponse.CatalogTypeEnum = { 
  RETAIL: 'RETAIL',
}
/** @enum {string} */
API.Client.CatalogsRetailItemResponse.ItemResponseKindEnum = { 
  retail_item: 'retail_item',
}
