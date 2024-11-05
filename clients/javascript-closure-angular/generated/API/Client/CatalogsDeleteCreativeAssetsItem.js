goog.provide('API.Client.CatalogsDeleteCreativeAssetsItem');

/**
 * A creative assets item to be deleted
 * @record
 */
API.Client.CatalogsDeleteCreativeAssetsItem = function() {}

/**
 * The catalog creative assets id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.CatalogsDeleteCreativeAssetsItem.prototype.creativeAssetsId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsDeleteCreativeAssetsItem.prototype.operation;

/** @enum {string} */
API.Client.CatalogsDeleteCreativeAssetsItem.OperationEnum = { 
  DELETE: 'DELETE',
}
