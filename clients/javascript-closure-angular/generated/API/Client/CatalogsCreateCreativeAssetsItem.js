goog.provide('API.Client.CatalogsCreateCreativeAssetsItem');

/**
 * A creative assets item to be created.
 * @record
 */
API.Client.CatalogsCreateCreativeAssetsItem = function() {}

/**
 * The catalog creative assets id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreateCreativeAssetsItem.prototype.creativeAssetsId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreateCreativeAssetsItem.prototype.operation;

/**
 * @type {!API.Client.CatalogsCreativeAssetsAttributes}
 * @export
 */
API.Client.CatalogsCreateCreativeAssetsItem.prototype.attributes;

/** @enum {string} */
API.Client.CatalogsCreateCreativeAssetsItem.OperationEnum = { 
  CREATE: 'CREATE',
}
