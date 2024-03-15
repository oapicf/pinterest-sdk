goog.provide('API.Client.CatalogsHotelItemResponse');

/**
 * Object describing a hotel record
 * @record
 */
API.Client.CatalogsHotelItemResponse = function() {}

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.CatalogsHotelItemResponse.prototype.catalogType;

/**
 * The catalog hotel id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelItemResponse.prototype.hotelId;

/**
 * The pins mapped to the item
 * @type {!Array<!API.Client.Pin>}
 * @export
 */
API.Client.CatalogsHotelItemResponse.prototype.pins;

/**
 * @type {!API.Client.CatalogsHotelAttributes}
 * @export
 */
API.Client.CatalogsHotelItemResponse.prototype.attributes;

