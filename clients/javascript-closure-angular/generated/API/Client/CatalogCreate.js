goog.provide('API.Client.CatalogCreate');

/**
 * Resource create operation model.
 * @record
 */
API.Client.CatalogCreate = function() {}

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.CatalogCreate.prototype.catalogType;

/**
 * A human-friendly name associated to a catalog entity.
 * @type {!string}
 * @export
 */
API.Client.CatalogCreate.prototype.name;

