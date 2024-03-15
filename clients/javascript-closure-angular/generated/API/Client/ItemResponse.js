goog.provide('API.Client.ItemResponse');

/**
 * Object describing an item record
 * @record
 */
API.Client.ItemResponse = function() {}

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.ItemResponse.prototype.catalogType;

/**
 * The catalog item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.ItemResponse.prototype.itemId;

/**
 * The pins mapped to the item
 * @type {!Array<!API.Client.Pin>}
 * @export
 */
API.Client.ItemResponse.prototype.pins;

/**
 * @type {!API.Client.CatalogsHotelAttributes}
 * @export
 */
API.Client.ItemResponse.prototype.attributes;

/**
 * The catalog hotel id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.ItemResponse.prototype.hotelId;

/**
 * Array with the errors for the item id requested
 * @type {!Array<!API.Client.ItemValidationEvent>}
 * @export
 */
API.Client.ItemResponse.prototype.errors;

