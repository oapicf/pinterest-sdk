goog.provide('API.Client.ItemResponse_anyOf_1');

/**
 * @record
 */
API.Client.ItemResponseAnyOf1 = function() {}

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.ItemResponseAnyOf1.prototype.catalogType;

/**
 * The catalog item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.ItemResponseAnyOf1.prototype.itemId;

/**
 * Array with the errors for the item id requested
 * @type {!Array<!API.Client.ItemValidationEvent>}
 * @export
 */
API.Client.ItemResponseAnyOf1.prototype.errors;

/**
 * The catalog hotel id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.ItemResponseAnyOf1.prototype.hotelId;

/**
 * The catalog creative assets id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.ItemResponseAnyOf1.prototype.creativeAssetsId;

