goog.provide('API.Client.CatalogsItemsRequest');

/**
 * Request object of catalogs items
 * @record
 */
API.Client.CatalogsItemsRequest = function() {}

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsItemsRequest.prototype.country;

/**
 * @type {!API.Client.CatalogsItemsRequest_language}
 * @export
 */
API.Client.CatalogsItemsRequest.prototype.language;

/**
 * @type {!API.Client.CatalogsItemsPostFilters}
 * @export
 */
API.Client.CatalogsItemsRequest.prototype.filters;

