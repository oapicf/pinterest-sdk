goog.provide('API.Client.CatalogsCreativeAssetsBatchItem');

/**
 * Creative assets batch item
 * @record
 */
API.Client.CatalogsCreativeAssetsBatchItem = function() {}

/**
 * The catalog creative assets id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsBatchItem.prototype.creativeAssetsId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsBatchItem.prototype.operation;

/**
 * @type {!API.Client.CatalogsUpdatableCreativeAssetsAttributes}
 * @export
 */
API.Client.CatalogsCreativeAssetsBatchItem.prototype.attributes;

/** @enum {string} */
API.Client.CatalogsCreativeAssetsBatchItem.OperationEnum = { 
  DELETE: 'DELETE',
}
