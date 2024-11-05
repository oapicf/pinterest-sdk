goog.provide('API.Client.CatalogsUpsertCreativeAssetsItem');

/**
 * A creative assets item to be upserted.
 * @record
 */
API.Client.CatalogsUpsertCreativeAssetsItem = function() {}

/**
 * The catalog creative assets id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.CatalogsUpsertCreativeAssetsItem.prototype.creativeAssetsId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsUpsertCreativeAssetsItem.prototype.operation;

/**
 * @type {!API.Client.CatalogsCreativeAssetsAttributes}
 * @export
 */
API.Client.CatalogsUpsertCreativeAssetsItem.prototype.attributes;

/** @enum {string} */
API.Client.CatalogsUpsertCreativeAssetsItem.OperationEnum = { 
  UPSERT: 'UPSERT',
}
