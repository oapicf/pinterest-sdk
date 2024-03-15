goog.provide('API.Client.CatalogsVerticalProductGroupCreateRequest');

/**
 * Request object for creating a hotel product group.
 * @record
 */
API.Client.CatalogsVerticalProductGroupCreateRequest = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalProductGroupCreateRequest.prototype.catalogType;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalProductGroupCreateRequest.prototype.name;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalProductGroupCreateRequest.prototype.description;

/**
 * @type {!API.Client.CatalogsHotelProductGroupFilters}
 * @export
 */
API.Client.CatalogsVerticalProductGroupCreateRequest.prototype.filters;

/**
 * Catalog id pertaining to the hotel product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalProductGroupCreateRequest.prototype.catalogId;

/** @enum {string} */
API.Client.CatalogsVerticalProductGroupCreateRequest.CatalogTypeEnum = { 
  HOTEL: 'HOTEL',
}
