goog.provide('API.Client.CatalogsCreateHotelItem');

/**
 * A hotel item to be created.
 * @record
 */
API.Client.CatalogsCreateHotelItem = function() {}

/**
 * @type {!API.Client.CatalogsHotelAttributes}
 * @export
 */
API.Client.CatalogsCreateHotelItem.prototype.attributes;

/**
 * The catalog hotel id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreateHotelItem.prototype.hotelId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreateHotelItem.prototype.operation;

/** @enum {string} */
API.Client.CatalogsCreateHotelItem.OperationEnum = { 
  CREATE: 'CREATE',
}
