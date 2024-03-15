goog.provide('API.Client.CatalogsUpsertHotelItem');

/**
 * A hotel item to be upserted.
 * @record
 */
API.Client.CatalogsUpsertHotelItem = function() {}

/**
 * The catalog hotel id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.CatalogsUpsertHotelItem.prototype.hotelId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsUpsertHotelItem.prototype.operation;

/**
 * @type {!API.Client.CatalogsHotelAttributes}
 * @export
 */
API.Client.CatalogsUpsertHotelItem.prototype.attributes;

/** @enum {string} */
API.Client.CatalogsUpsertHotelItem.OperationEnum = { 
  UPSERT: 'UPSERT',
}
