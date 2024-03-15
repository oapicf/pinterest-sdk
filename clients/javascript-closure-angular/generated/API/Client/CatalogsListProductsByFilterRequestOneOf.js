goog.provide('API.Client.CatalogsListProductsByFilterRequest_oneOf');

/**
 * Request object to list products for a given feed_id and product group filter.
 * @record
 */
API.Client.CatalogsListProductsByFilterRequestOneOf = function() {}

/**
 * Catalog Feed id pertaining to the catalog product group filter.
 * @type {!string}
 * @export
 */
API.Client.CatalogsListProductsByFilterRequestOneOf.prototype.feedId;

/**
 * @type {!API.Client.CatalogsProductGroupFilters}
 * @export
 */
API.Client.CatalogsListProductsByFilterRequestOneOf.prototype.filters;

