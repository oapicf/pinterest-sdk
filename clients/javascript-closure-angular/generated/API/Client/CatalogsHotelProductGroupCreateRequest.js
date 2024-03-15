goog.provide('API.Client.CatalogsHotelProductGroupCreateRequest');

/**
 * Request object for creating a hotel product group.
 * @record
 */
API.Client.CatalogsHotelProductGroupCreateRequest = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelProductGroupCreateRequest.prototype.catalogType;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelProductGroupCreateRequest.prototype.name;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelProductGroupCreateRequest.prototype.description;

/**
 * @type {!API.Client.CatalogsHotelProductGroupFilters}
 * @export
 */
API.Client.CatalogsHotelProductGroupCreateRequest.prototype.filters;

/**
 * Catalog id pertaining to the hotel product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelProductGroupCreateRequest.prototype.catalogId;

/** @enum {string} */
API.Client.CatalogsHotelProductGroupCreateRequest.CatalogTypeEnum = { 
  HOTEL: 'HOTEL',
}
