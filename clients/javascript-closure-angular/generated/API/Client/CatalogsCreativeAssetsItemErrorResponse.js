goog.provide('API.Client.CatalogsCreativeAssetsItemErrorResponse');

/**
 * Object describing a creative assets item error
 * @record
 */
API.Client.CatalogsCreativeAssetsItemErrorResponse = function() {}

/**
 * @type {!string}
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

/**
 * Discriminator literal identifying this leaf inside an `ItemResponse` payload.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsItemErrorResponse.prototype.itemResponseKind;

/** @enum {string} */
API.Client.CatalogsCreativeAssetsItemErrorResponse.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
/** @enum {string} */
API.Client.CatalogsCreativeAssetsItemErrorResponse.ItemResponseKindEnum = { 
  creative_assets_item_error: 'creative_assets_item_error',
}
