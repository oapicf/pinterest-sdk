goog.provide('API.Client.CatalogsRetailItemErrorResponse');

/**
 * Object describing a retail item error
 * @record
 */
API.Client.CatalogsRetailItemErrorResponse = function() {}

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.CatalogsRetailItemErrorResponse.prototype.catalogType;

/**
 * The catalog item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailItemErrorResponse.prototype.itemId;

/**
 * Array with the errors for the item id requested
 * @type {!Array<!API.Client.ItemValidationEvent>}
 * @export
 */
API.Client.CatalogsRetailItemErrorResponse.prototype.errors;

