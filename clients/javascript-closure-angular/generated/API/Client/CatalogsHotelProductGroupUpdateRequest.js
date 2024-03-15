goog.provide('API.Client.CatalogsHotelProductGroupUpdateRequest');

/**
 * Request object for updating a hotel product group.
 * @record
 */
API.Client.CatalogsHotelProductGroupUpdateRequest = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelProductGroupUpdateRequest.prototype.catalogType;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelProductGroupUpdateRequest.prototype.name;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelProductGroupUpdateRequest.prototype.description;

/**
 * @type {!API.Client.CatalogsHotelProductGroupFilters}
 * @export
 */
API.Client.CatalogsHotelProductGroupUpdateRequest.prototype.filters;

/** @enum {string} */
API.Client.CatalogsHotelProductGroupUpdateRequest.CatalogTypeEnum = { 
  HOTEL: 'HOTEL',
}
