goog.provide('API.Client.CatalogsVerticalProductGroupUpdateRequest');

/**
 * Request object for updating a hotel product group.
 * @record
 */
API.Client.CatalogsVerticalProductGroupUpdateRequest = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalProductGroupUpdateRequest.prototype.catalogType;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalProductGroupUpdateRequest.prototype.name;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalProductGroupUpdateRequest.prototype.description;

/**
 * @type {!API.Client.CatalogsHotelProductGroupFilters}
 * @export
 */
API.Client.CatalogsVerticalProductGroupUpdateRequest.prototype.filters;

/** @enum {string} */
API.Client.CatalogsVerticalProductGroupUpdateRequest.CatalogTypeEnum = { 
  HOTEL: 'HOTEL',
}
