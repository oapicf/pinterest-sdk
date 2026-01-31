goog.provide('API.Client.CatalogsHotelItemsPostFilter');

/**
 * @record
 */
API.Client.CatalogsHotelItemsPostFilter = function() {}

/**
 * Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelItemsPostFilter.prototype.catalogId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelItemsPostFilter.prototype.catalogType;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsHotelItemsPostFilter.prototype.hotelIds;

/** @enum {string} */
API.Client.CatalogsHotelItemsPostFilter.CatalogTypeEnum = { 
  HOTEL: 'HOTEL',
}
