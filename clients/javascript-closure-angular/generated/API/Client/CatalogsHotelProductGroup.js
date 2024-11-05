goog.provide('API.Client.CatalogsHotelProductGroup');

/**
 * @record
 */
API.Client.CatalogsHotelProductGroup = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelProductGroup.prototype.catalogType;

/**
 * ID of the hotel product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelProductGroup.prototype.id;

/**
 * Name of hotel product group
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelProductGroup.prototype.name;

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
 * Unix timestamp in seconds of when catalog product group was created.
 * @type {!number}
 * @export
 */
API.Client.CatalogsHotelProductGroup.prototype.createdAt;

/**
 * Unix timestamp in seconds of last time catalog product group was updated.
 * @type {!number}
 * @export
 */
API.Client.CatalogsHotelProductGroup.prototype.updatedAt;

/**
 * Catalog id pertaining to the hotel product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelProductGroup.prototype.catalogId;

/** @enum {string} */
API.Client.CatalogsHotelProductGroup.CatalogTypeEnum = { 
  HOTEL: 'HOTEL',
}
