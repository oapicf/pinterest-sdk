goog.provide('API.Client.CatalogsRetailAvailableFilterValues');

/**
 * @record
 */
API.Client.CatalogsRetailAvailableFilterValues = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailAvailableFilterValues.prototype.catalogType;

/**
 * @type {!API.Client.catalogs_retail_filter_values_map}
 * @export
 */
API.Client.CatalogsRetailAvailableFilterValues.prototype.filterValues;

/** @enum {string} */
API.Client.CatalogsRetailAvailableFilterValues.CatalogTypeEnum = { 
  RETAIL: 'RETAIL',
}
