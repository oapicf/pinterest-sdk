goog.provide('API.Client.CatalogsHotelItemsFilter');

/**
 * @record
 */
API.Client.CatalogsHotelItemsFilter = function() {}

/**
 * Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelItemsFilter.prototype.catalogId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelItemsFilter.prototype.catalogType;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsHotelItemsFilter.prototype.hotelIds;

/** @enum {string} */
API.Client.CatalogsHotelItemsFilter.CatalogTypeEnum = { 
  HOTEL: 'HOTEL',
}
