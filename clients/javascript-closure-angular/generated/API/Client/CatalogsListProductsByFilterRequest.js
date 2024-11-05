goog.provide('API.Client.CatalogsListProductsByFilterRequest');

/**
 * Request object to list products for a given product group filter.
 * @record
 */
API.Client.CatalogsListProductsByFilterRequest = function() {}

/**
 * Catalog Feed id pertaining to the catalog product group filter.
 * @type {!string}
 * @export
 */
API.Client.CatalogsListProductsByFilterRequest.prototype.feedId;

/**
 * @type {!API.Client.CatalogsCreativeAssetsProductGroupFilters}
 * @export
 */
API.Client.CatalogsListProductsByFilterRequest.prototype.filters;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsListProductsByFilterRequest.prototype.catalogType;

/**
 * Catalog id pertaining to the creative assets product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsListProductsByFilterRequest.prototype.catalogId;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsListProductsByFilterRequest.prototype.country;

/**
 * @type {!API.Client.CatalogsLocale}
 * @export
 */
API.Client.CatalogsListProductsByFilterRequest.prototype.locale;

/** @enum {string} */
API.Client.CatalogsListProductsByFilterRequest.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
