goog.provide('API.Client.CatalogsListProductsByFeedBasedFilter');

/**
 * Request object to list products for a given feed_id and product group filter.
 * @record
 */
API.Client.CatalogsListProductsByFeedBasedFilter = function() {}

/**
 * Catalog Feed id pertaining to the catalog product group filter.
 * @type {!string}
 * @export
 */
API.Client.CatalogsListProductsByFeedBasedFilter.prototype.feedId;

/**
 * @type {!API.Client.CatalogsProductGroupFilters}
 * @export
 */
API.Client.CatalogsListProductsByFeedBasedFilter.prototype.filters;

