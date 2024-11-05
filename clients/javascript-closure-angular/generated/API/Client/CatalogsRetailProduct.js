goog.provide('API.Client.CatalogsRetailProduct');

/**
 * @record
 */
API.Client.CatalogsRetailProduct = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailProduct.prototype.catalogType;

/**
 * @type {!API.Client.CatalogsRetailProductMetadata}
 * @export
 */
API.Client.CatalogsRetailProduct.prototype.metadata;

/**
 * @type {!API.Client.Pin}
 * @export
 */
API.Client.CatalogsRetailProduct.prototype.pin;

/** @enum {string} */
API.Client.CatalogsRetailProduct.CatalogTypeEnum = { 
  RETAIL: 'RETAIL',
}
