goog.provide('API.Client.CatalogsCreativeAssetsItemResponse');

/**
 * Object describing a hotel record
 * @record
 */
API.Client.CatalogsCreativeAssetsItemResponse = function() {}

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.CatalogsCreativeAssetsItemResponse.prototype.catalogType;

/**
 * The catalog creative assets id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsItemResponse.prototype.creativeAssetsId;

/**
 * The pins mapped to the item
 * @type {!Array<!API.Client.Pin>}
 * @export
 */
API.Client.CatalogsCreativeAssetsItemResponse.prototype.pins;

/**
 * @type {!API.Client.CatalogsCreativeAssetsAttributes}
 * @export
 */
API.Client.CatalogsCreativeAssetsItemResponse.prototype.attributes;

