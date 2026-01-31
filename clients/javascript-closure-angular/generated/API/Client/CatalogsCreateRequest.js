goog.provide('API.Client.CatalogsCreateRequest');

/**
 * Request object for creating a catalog.
 * @record
 */
API.Client.CatalogsCreateRequest = function() {}

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.CatalogsCreateRequest.prototype.catalogType;

/**
 * A human-friendly name associated to a given catalog.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreateRequest.prototype.name;

