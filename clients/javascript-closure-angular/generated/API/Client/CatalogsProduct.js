goog.provide('API.Client.CatalogsProduct');

/**
 * @record
 */
API.Client.CatalogsProduct = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProduct.prototype.catalogType;

/**
 * @type {!API.Client.CatalogsCreativeAssetsProductMetadata}
 * @export
 */
API.Client.CatalogsProduct.prototype.metadata;

/**
 * @type {!API.Client.Pin}
 * @export
 */
API.Client.CatalogsProduct.prototype.pin;

/** @enum {string} */
API.Client.CatalogsProduct.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
