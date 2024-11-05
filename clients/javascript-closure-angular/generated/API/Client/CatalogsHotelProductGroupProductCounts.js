goog.provide('API.Client.CatalogsHotelProductGroupProductCounts');

/**
 * Product counts for a Hotel CatalogsProductGroup
 * @record
 */
API.Client.CatalogsHotelProductGroupProductCounts = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelProductGroupProductCounts.prototype.catalogType;

/**
 * @type {!number}
 * @export
 */
API.Client.CatalogsHotelProductGroupProductCounts.prototype.total;

/** @enum {string} */
API.Client.CatalogsHotelProductGroupProductCounts.CatalogTypeEnum = { 
  HOTEL: 'HOTEL',
}
