goog.provide('API.Client.CatalogsHotelItemResponse');

/**
 * Object describing a hotel record
 * @record
 */
API.Client.CatalogsHotelItemResponse = function() {}

/**
 * @type {!API.Client.CatalogsHotelAttributes}
 * @export
 */
API.Client.CatalogsHotelItemResponse.prototype.attributes;

/**
 * @type {!string}
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
 * Discriminator literal identifying this leaf inside an `ItemResponse` payload.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelItemResponse.prototype.itemResponseKind;

/**
 * The pins mapped to the item
 * @type {!Array<!API.Client.Pin>}
 * @export
 */
API.Client.CatalogsHotelItemResponse.prototype.pins;

/** @enum {string} */
API.Client.CatalogsHotelItemResponse.CatalogTypeEnum = { 
  HOTEL: 'HOTEL',
}
/** @enum {string} */
API.Client.CatalogsHotelItemResponse.ItemResponseKindEnum = { 
  hotel_item: 'hotel_item',
}
