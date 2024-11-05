goog.provide('API.Client.CatalogsCreativeAssetsItemsFilter');

/**
 * @record
 */
API.Client.CatalogsCreativeAssetsItemsFilter = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsItemsFilter.prototype.catalogType;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsCreativeAssetsItemsFilter.prototype.creativeAssetsIds;

/**
 * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsItemsFilter.prototype.catalogId;

/** @enum {string} */
API.Client.CatalogsCreativeAssetsItemsFilter.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
