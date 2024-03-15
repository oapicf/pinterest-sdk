goog.provide('API.Client.CatalogsUpdateHotelItem');

/**
 * Object describing an hotel item batch record
 * @record
 */
API.Client.CatalogsUpdateHotelItem = function() {}

/**
 * The catalog hotel item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.CatalogsUpdateHotelItem.prototype.hotelId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsUpdateHotelItem.prototype.operation;

/**
 * @type {!API.Client.CatalogsUpdatableHotelAttributes}
 * @export
 */
API.Client.CatalogsUpdateHotelItem.prototype.attributes;

/** @enum {string} */
API.Client.CatalogsUpdateHotelItem.OperationEnum = { 
  UPDATE: 'UPDATE',
}
