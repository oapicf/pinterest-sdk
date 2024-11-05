goog.provide('API.Client.items_batch_post_request');

/**
 * @record
 */
API.Client.ItemsBatchPostRequest = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ItemsBatchPostRequest.prototype.catalogType;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.ItemsBatchPostRequest.prototype.country;

/**
 * @type {!API.Client.CatalogsItemsRequest_language}
 * @export
 */
API.Client.ItemsBatchPostRequest.prototype.language;

/**
 * Array with catalogs items
 * @type {!Array<!API.Client.ItemDeleteBatchRecord>}
 * @export
 */
API.Client.ItemsBatchPostRequest.prototype.items;

/**
 * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
 * @type {!string}
 * @export
 */
API.Client.ItemsBatchPostRequest.prototype.catalogId;

/**
 * @type {!API.Client.BatchOperation}
 * @export
 */
API.Client.ItemsBatchPostRequest.prototype.operation;

/** @enum {string} */
API.Client.ItemsBatchPostRequest.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
