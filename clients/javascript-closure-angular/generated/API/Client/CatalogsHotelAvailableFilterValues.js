goog.provide('API.Client.CatalogsHotelAvailableFilterValues');

/**
 * @record
 */
API.Client.CatalogsHotelAvailableFilterValues = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelAvailableFilterValues.prototype.catalogType;

/**
 * @type {!API.Client.CatalogsHotelFilterValuesMap}
 * @export
 */
API.Client.CatalogsHotelAvailableFilterValues.prototype.filterValues;

/** @enum {string} */
API.Client.CatalogsHotelAvailableFilterValues.CatalogTypeEnum = { 
  HOTEL: 'HOTEL',
}
