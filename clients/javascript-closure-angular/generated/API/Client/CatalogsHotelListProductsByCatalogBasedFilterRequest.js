goog.provide('API.Client.CatalogsHotelListProductsByCatalogBasedFilterRequest');

/**
 * Request object to list products for a given hotel catalog_id and product group filter.
 * @record
 */
API.Client.CatalogsHotelListProductsByCatalogBasedFilterRequest = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelListProductsByCatalogBasedFilterRequest.prototype.catalogType;

/**
 * Catalog id pertaining to the hotel product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelListProductsByCatalogBasedFilterRequest.prototype.catalogId;

/**
 * @type {!API.Client.CatalogsHotelProductGroupFilters}
 * @export
 */
API.Client.CatalogsHotelListProductsByCatalogBasedFilterRequest.prototype.filters;

/** @enum {string} */
API.Client.CatalogsHotelListProductsByCatalogBasedFilterRequest.CatalogTypeEnum = { 
  HOTEL: 'HOTEL',
}
