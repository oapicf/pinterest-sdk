goog.provide('API.Client.CatalogsHotelItemErrorResponse');

/**
 * Object describing a hotel item error
 * @record
 */
API.Client.CatalogsHotelItemErrorResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelItemErrorResponse.prototype.catalogType;

/**
 * Array with the errors for the item id requested
 * @type {!Array<!API.Client.ItemValidationEvent>}
 * @export
 */
API.Client.CatalogsHotelItemErrorResponse.prototype.errors;

/**
 * The catalog hotel id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelItemErrorResponse.prototype.hotelId;

/**
 * Discriminator literal identifying this leaf inside an `ItemResponse` payload.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelItemErrorResponse.prototype.itemResponseKind;

/** @enum {string} */
API.Client.CatalogsHotelItemErrorResponse.CatalogTypeEnum = { 
  HOTEL: 'HOTEL',
}
/** @enum {string} */
API.Client.CatalogsHotelItemErrorResponse.ItemResponseKindEnum = { 
  hotel_item_error: 'hotel_item_error',
}
