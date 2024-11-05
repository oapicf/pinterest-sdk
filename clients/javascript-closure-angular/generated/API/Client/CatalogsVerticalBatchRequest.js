goog.provide('API.Client.CatalogsVerticalBatchRequest');

/**
 * A request object that can have multiple operations on a single batch
 * @record
 */
API.Client.CatalogsVerticalBatchRequest = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalBatchRequest.prototype.catalogType;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsVerticalBatchRequest.prototype.country;

/**
 * @type {!API.Client.CatalogsItemsRequest_language}
 * @export
 */
API.Client.CatalogsVerticalBatchRequest.prototype.language;

/**
 * Array with creative assets item operations
 * @type {!Array<!API.Client.CatalogsCreativeAssetsBatchItem>}
 * @export
 */
API.Client.CatalogsVerticalBatchRequest.prototype.items;

/**
 * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalBatchRequest.prototype.catalogId;

/** @enum {string} */
API.Client.CatalogsVerticalBatchRequest.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
