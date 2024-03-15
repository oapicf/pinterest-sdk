goog.provide('API.Client.CatalogsRetailItemResponse');

/**
 * Object describing a retail item record
 * @record
 */
API.Client.CatalogsRetailItemResponse = function() {}

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.CatalogsRetailItemResponse.prototype.catalogType;

/**
 * The catalog retail item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailItemResponse.prototype.itemId;

/**
 * The pins mapped to the item
 * @type {!Array<!API.Client.Pin>}
 * @export
 */
API.Client.CatalogsRetailItemResponse.prototype.pins;

/**
 * @type {!API.Client.ItemAttributes}
 * @export
 */
API.Client.CatalogsRetailItemResponse.prototype.attributes;

