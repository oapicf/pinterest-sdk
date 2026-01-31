goog.provide('API.Client.Catalog');

/**
 * Catalog entity
 * @record
 */
API.Client.Catalog = function() {}

/**
 * @type {!Date}
 * @export
 */
API.Client.Catalog.prototype.createdAt;

/**
 * ID of the catalog entity.
 * @type {!string}
 * @export
 */
API.Client.Catalog.prototype.id;

/**
 * @type {!Date}
 * @export
 */
API.Client.Catalog.prototype.updatedAt;

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.Catalog.prototype.catalogType;

/**
 * A human-friendly name associated to a catalog entity.
 * @type {!string}
 * @export
 */
API.Client.Catalog.prototype.name;

