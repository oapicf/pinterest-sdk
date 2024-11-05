goog.provide('API.Client.CatalogsCreateRequest');

/**
 * Request object for creating a catalog.
 * @record
 */
API.Client.CatalogsCreateRequest = function() {}

/**
 * Type of the catalog entity.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreateRequest.prototype.catalogType;

/**
 * A human-friendly name associated to a given catalog.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreateRequest.prototype.name;

/** @enum {string} */
API.Client.CatalogsCreateRequest.CatalogTypeEnum = { 
  HOTEL: 'HOTEL',
}
