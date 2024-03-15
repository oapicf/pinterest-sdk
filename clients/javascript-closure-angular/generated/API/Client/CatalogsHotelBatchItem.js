goog.provide('API.Client.CatalogsHotelBatchItem');

/**
 * Hotel batch item
 * @record
 */
API.Client.CatalogsHotelBatchItem = function() {}

/**
 * The catalog hotel id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelBatchItem.prototype.hotelId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelBatchItem.prototype.operation;

/**
 * @type {!API.Client.CatalogsUpdatableHotelAttributes}
 * @export
 */
API.Client.CatalogsHotelBatchItem.prototype.attributes;

/** @enum {string} */
API.Client.CatalogsHotelBatchItem.OperationEnum = { 
  DELETE: 'DELETE',
}
