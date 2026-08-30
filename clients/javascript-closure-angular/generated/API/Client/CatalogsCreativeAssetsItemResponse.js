goog.provide('API.Client.CatalogsCreativeAssetsItemResponse');

/**
 * Object describing a creative assets item record
 * @record
 */
API.Client.CatalogsCreativeAssetsItemResponse = function() {}

/**
 * @type {!API.Client.CatalogsCreativeAssetsAttributes}
 * @export
 */
API.Client.CatalogsCreativeAssetsItemResponse.prototype.attributes;

/**
 * @type {!string}
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
 * Discriminator literal identifying this leaf inside an `ItemResponse` payload.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsItemResponse.prototype.itemResponseKind;

/**
 * The pins mapped to the item
 * @type {!Array<!API.Client.Pin>}
 * @export
 */
API.Client.CatalogsCreativeAssetsItemResponse.prototype.pins;

/** @enum {string} */
API.Client.CatalogsCreativeAssetsItemResponse.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
/** @enum {string} */
API.Client.CatalogsCreativeAssetsItemResponse.ItemResponseKindEnum = { 
  creative_assets_item: 'creative_assets_item',
}
