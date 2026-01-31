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
 * @type {!API.Client.catalogs_creative_assets_filter_values_map}
 * @export
 */
API.Client.CatalogsCreativeAssetsAvailableFilterValues.prototype.filterValues;

/** @enum {string} */
API.Client.CatalogsCreativeAssetsAvailableFilterValues.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
