goog.provide('API.Client.CatalogsCreativeAssetsItemsPostFilter');

/**
 * @record
 */
API.Client.CatalogsCreativeAssetsItemsPostFilter = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsItemsPostFilter.prototype.catalogType;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsCreativeAssetsItemsPostFilter.prototype.creativeAssetsIds;

/**
 * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsItemsPostFilter.prototype.catalogId;

/** @enum {string} */
API.Client.CatalogsCreativeAssetsItemsPostFilter.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
