goog.provide('API.Client.CatalogsUpdateCreativeAssetsItem');

/**
 * A creative assets item to be updated.
 * @record
 */
API.Client.CatalogsUpdateCreativeAssetsItem = function() {}

/**
 * The catalog creative assets item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.CatalogsUpdateCreativeAssetsItem.prototype.creativeAssetsId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsUpdateCreativeAssetsItem.prototype.operation;

/**
 * @type {!API.Client.CatalogsUpdatableCreativeAssetsAttributes}
 * @export
 */
API.Client.CatalogsUpdateCreativeAssetsItem.prototype.attributes;

/** @enum {string} */
API.Client.CatalogsUpdateCreativeAssetsItem.OperationEnum = { 
  UPDATE: 'UPDATE',
}
