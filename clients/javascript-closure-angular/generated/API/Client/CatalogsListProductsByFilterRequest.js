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
 * @type {!API.Client.CatalogsProductGroupFilters}
 * @export
 */
API.Client.CatalogsListProductsByFilterRequest.prototype.filters;

