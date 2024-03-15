goog.provide('API.Client.ItemResponse_anyOf');

/**
 * @record
 */
API.Client.ItemResponseAnyOf = function() {}

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.ItemResponseAnyOf.prototype.catalogType;

/**
 * The catalog retail item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.ItemResponseAnyOf.prototype.itemId;

/**
 * The pins mapped to the item
 * @type {!Array<!API.Client.Pin>}
 * @export
 */
API.Client.ItemResponseAnyOf.prototype.pins;

/**
 * @type {!API.Client.CatalogsHotelAttributes}
 * @export
 */
API.Client.ItemResponseAnyOf.prototype.attributes;

/**
 * The catalog hotel id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.ItemResponseAnyOf.prototype.hotelId;

