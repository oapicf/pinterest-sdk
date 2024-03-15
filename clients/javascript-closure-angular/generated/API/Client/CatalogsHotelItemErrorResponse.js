goog.provide('API.Client.CatalogsHotelItemErrorResponse');

/**
 * Object describing a hotel item error
 * @record
 */
API.Client.CatalogsHotelItemErrorResponse = function() {}

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.CatalogsHotelItemErrorResponse.prototype.catalogType;

/**
 * The catalog hotel id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelItemErrorResponse.prototype.hotelId;

/**
 * Array with the errors for the item id requested
 * @type {!Array<!API.Client.ItemValidationEvent>}
 * @export
 */
API.Client.CatalogsHotelItemErrorResponse.prototype.errors;

