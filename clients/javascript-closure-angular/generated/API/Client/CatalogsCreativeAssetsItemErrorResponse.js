goog.provide('API.Client.CatalogsCreativeAssetsItemErrorResponse');

/**
 * Object describing a creative assets item error
 * @record
 */
API.Client.CatalogsCreativeAssetsItemErrorResponse = function() {}

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.CatalogsCreativeAssetsItemErrorResponse.prototype.catalogType;

/**
 * The catalog creative assets id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsItemErrorResponse.prototype.creativeAssetsId;

/**
 * Array with the errors for the item id requested
 * @type {!Array<!API.Client.ItemValidationEvent>}
 * @export
 */
API.Client.CatalogsCreativeAssetsItemErrorResponse.prototype.errors;

