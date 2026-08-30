goog.provide('API.Client.CatalogsHotelProductGroup');

/**
 * @record
 */
API.Client.CatalogsHotelProductGroup = function() {}

/**
 * Catalog ID pertaining to the product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelProductGroup.prototype.catalogId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelProductGroup.prototype.catalogType;

/**
 * Unix timestamp in seconds of when catalog product group was created.
 * @type {!number}
 * @export
 */
API.Client.CatalogsHotelProductGroup.prototype.createdAt;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelProductGroup.prototype.description;

/**
 * @type {!API.Client.CatalogsHotelProductGroupFilters}
 * @export
 */
API.Client.CatalogsHotelProductGroup.prototype.filters;

/**
 * ID of the catalog product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelProductGroup.prototype.id;

/**
 * Name of catalog product group
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelProductGroup.prototype.name;

/**
 * @type {!API.Client.CatalogsHotelProductGroupType}
 * @export
 */
API.Client.CatalogsHotelProductGroup.prototype.type;

/**
 * Unix timestamp in seconds of last time catalog product group was updated.
 * @type {!number}
 * @export
 */
API.Client.CatalogsHotelProductGroup.prototype.updatedAt;

/** @enum {string} */
API.Client.CatalogsHotelProductGroup.CatalogTypeEnum = { 
  HOTEL: 'HOTEL',
}
