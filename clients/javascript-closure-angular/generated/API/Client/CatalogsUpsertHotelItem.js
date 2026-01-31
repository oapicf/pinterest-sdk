goog.provide('API.Client.CatalogsUpsertHotelItem');

/**
 * A hotel item to be upserted.
 * @record
 */
API.Client.CatalogsUpsertHotelItem = function() {}

/**
 * @type {!API.Client.CatalogsHotelAttributes}
 * @export
 */
API.Client.CatalogsUpsertHotelItem.prototype.attributes;

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

/** @enum {string} */
API.Client.CatalogsUpsertHotelItem.OperationEnum = { 
  UPSERT: 'UPSERT',
}
