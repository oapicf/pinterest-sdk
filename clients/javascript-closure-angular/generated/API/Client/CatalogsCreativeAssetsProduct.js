goog.provide('API.Client.CatalogsCreativeAssetsProduct');

/**
 * @record
 */
API.Client.CatalogsCreativeAssetsProduct = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsProduct.prototype.catalogType;

/**
 * @type {!API.Client.CatalogsCreativeAssetsProductMetadata}
 * @export
 */
API.Client.CatalogsCreativeAssetsProduct.prototype.metadata;

/**
 * @type {!API.Client.Pin}
 * @export
 */
API.Client.CatalogsCreativeAssetsProduct.prototype.pin;

/** @enum {string} */
API.Client.CatalogsCreativeAssetsProduct.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
