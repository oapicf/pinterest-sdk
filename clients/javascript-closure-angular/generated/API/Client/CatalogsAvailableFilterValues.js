goog.provide('API.Client.CatalogsAvailableFilterValues');

/**
 * Object holding available filter values for each filter key
 * @record
 */
API.Client.CatalogsAvailableFilterValues = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsAvailableFilterValues.prototype.catalogType;

/**
 * @type {!API.Client.CatalogsCreativeAssetsFilterValuesMap}
 * @export
 */
API.Client.CatalogsAvailableFilterValues.prototype.filterValues;

/** @enum {string} */
API.Client.CatalogsAvailableFilterValues.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
