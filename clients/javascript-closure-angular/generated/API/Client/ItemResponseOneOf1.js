goog.provide('API.Client.ItemResponse_oneOf_1');

/**
 * Error item response
 * @record
 */
API.Client.ItemResponseOneOf1 = function() {}

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.ItemResponseOneOf1.prototype.catalogType;

/**
 * @type {!Array<!API.Client.ItemValidationEvent>}
 * @export
 */
API.Client.ItemResponseOneOf1.prototype.errors;

/**
 * The catalog item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.ItemResponseOneOf1.prototype.itemId;

/**
 * The catalog hotel id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.ItemResponseOneOf1.prototype.hotelId;

/**
 * The catalog creative assets id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.ItemResponseOneOf1.prototype.creativeAssetsId;

