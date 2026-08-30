goog.provide('API.Client.CatalogsCreativeAssetsAvailableFilterValues');

/**
 * @record
 */
API.Client.CatalogsCreativeAssetsAvailableFilterValues = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsAvailableFilterValues.prototype.catalogType;

/**
 * @type {!API.Client.CatalogsCreativeAssetsFilterValuesMap}
 * @export
 */
API.Client.CatalogsCreativeAssetsAvailableFilterValues.prototype.filterValues;

/** @enum {string} */
API.Client.CatalogsCreativeAssetsAvailableFilterValues.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
