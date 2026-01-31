goog.provide('API.Client.ItemResponse_oneOf');

/**
 * Successful item response
 * @record
 */
API.Client.ItemResponseOneOf = function() {}

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.ItemResponseOneOf.prototype.catalogType;

/**
 * @type {!API.Client.CatalogsCreativeAssetsAttributes}
 * @export
 */
API.Client.ItemResponseOneOf.prototype.attributes;

/**
 * The catalog retail item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.ItemResponseOneOf.prototype.itemId;

/**
 * The pins mapped to the item
 * @type {!Array<!API.Client.Pin>}
 * @export
 */
API.Client.ItemResponseOneOf.prototype.pins;

/**
 * The catalog hotel id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.ItemResponseOneOf.prototype.hotelId;

/**
 * The catalog creative assets id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.ItemResponseOneOf.prototype.creativeAssetsId;

