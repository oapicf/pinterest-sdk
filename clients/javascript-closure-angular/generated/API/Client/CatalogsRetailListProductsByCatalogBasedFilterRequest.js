goog.provide('API.Client.CatalogsRetailListProductsByCatalogBasedFilterRequest');

/**
 * Request object to list products for a given retail catalog_id and product group filter.
 * @record
 */
API.Client.CatalogsRetailListProductsByCatalogBasedFilterRequest = function() {}

/**
 * Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailListProductsByCatalogBasedFilterRequest.prototype.catalogType;

/**
 * Catalog id pertaining to the retail product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailListProductsByCatalogBasedFilterRequest.prototype.catalogId;

/**
 * @type {!API.Client.CatalogsProductGroupFilters}
 * @export
 */
API.Client.CatalogsRetailListProductsByCatalogBasedFilterRequest.prototype.filters;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsRetailListProductsByCatalogBasedFilterRequest.prototype.country;

/**
 * @type {!API.Client.CatalogsLocale}
 * @export
 */
API.Client.CatalogsRetailListProductsByCatalogBasedFilterRequest.prototype.locale;

/** @enum {string} */
API.Client.CatalogsRetailListProductsByCatalogBasedFilterRequest.CatalogTypeEnum = { 
  RETAIL: 'RETAIL',
}
