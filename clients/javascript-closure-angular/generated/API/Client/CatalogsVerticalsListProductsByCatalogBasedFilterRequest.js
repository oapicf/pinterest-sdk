goog.provide('API.Client.CatalogsVerticalsListProductsByCatalogBasedFilterRequest');

/**
 * Request object to list products for a given catalog_id and product group filter.
 * @record
 */
API.Client.CatalogsVerticalsListProductsByCatalogBasedFilterRequest = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalsListProductsByCatalogBasedFilterRequest.prototype.catalogType;

/**
 * Catalog id pertaining to the creative assets product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalsListProductsByCatalogBasedFilterRequest.prototype.catalogId;

/**
 * @type {!API.Client.CatalogsCreativeAssetsProductGroupFilters}
 * @export
 */
API.Client.CatalogsVerticalsListProductsByCatalogBasedFilterRequest.prototype.filters;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsVerticalsListProductsByCatalogBasedFilterRequest.prototype.country;

/**
 * @type {!API.Client.CatalogsLocale}
 * @export
 */
API.Client.CatalogsVerticalsListProductsByCatalogBasedFilterRequest.prototype.locale;

/** @enum {string} */
API.Client.CatalogsVerticalsListProductsByCatalogBasedFilterRequest.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
