goog.provide('API.Client.CatalogsHotelProduct');

/**
 * @record
 */
API.Client.CatalogsHotelProduct = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelProduct.prototype.catalogType;

/**
 * @type {!API.Client.CatalogsHotelProductMetadata}
 * @export
 */
API.Client.CatalogsHotelProduct.prototype.metadata;

/**
 * @type {!API.Client.Pin}
 * @export
 */
API.Client.CatalogsHotelProduct.prototype.pin;

/** @enum {string} */
API.Client.CatalogsHotelProduct.CatalogTypeEnum = { 
  HOTEL: 'HOTEL',
}
