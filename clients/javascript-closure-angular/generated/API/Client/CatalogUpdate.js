goog.provide('API.Client.CatalogUpdate');

/**
 * Resource create or update operation model.
 * @record
 */
API.Client.CatalogUpdate = function() {}

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.CatalogUpdate.prototype.catalogType;

/**
 * A human-friendly name associated to a catalog entity.
 * @type {!string}
 * @export
 */
API.Client.CatalogUpdate.prototype.name;

