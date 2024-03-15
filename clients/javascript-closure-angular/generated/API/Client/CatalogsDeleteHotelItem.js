goog.provide('API.Client.CatalogsDeleteHotelItem');

/**
 * A hotel item to be deleted
 * @record
 */
API.Client.CatalogsDeleteHotelItem = function() {}

/**
 * The catalog hotel id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.CatalogsDeleteHotelItem.prototype.hotelId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsDeleteHotelItem.prototype.operation;

/** @enum {string} */
API.Client.CatalogsDeleteHotelItem.OperationEnum = { 
  DELETE: 'DELETE',
}
