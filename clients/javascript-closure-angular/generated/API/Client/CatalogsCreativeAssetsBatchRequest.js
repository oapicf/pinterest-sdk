goog.provide('API.Client.CatalogsCreativeAssetsBatchRequest');

/**
 * Request object to update catalogs creative assets items
 * @record
 */
API.Client.CatalogsCreativeAssetsBatchRequest = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsBatchRequest.prototype.catalogType;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsCreativeAssetsBatchRequest.prototype.country;

/**
 * @type {!API.Client.CatalogsItemsRequest_language}
 * @export
 */
API.Client.CatalogsCreativeAssetsBatchRequest.prototype.language;

/**
 * Array with creative assets item operations
 * @type {!Array<!API.Client.CatalogsCreativeAssetsBatchItem>}
 * @export
 */
API.Client.CatalogsCreativeAssetsBatchRequest.prototype.items;

/**
 * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsBatchRequest.prototype.catalogId;

/** @enum {string} */
API.Client.CatalogsCreativeAssetsBatchRequest.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
