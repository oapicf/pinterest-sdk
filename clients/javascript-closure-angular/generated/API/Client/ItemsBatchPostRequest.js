goog.provide('API.Client.items_batch_post_request');

/**
 * @record
 */
API.Client.ItemsBatchPostRequest = function() {}

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.ItemsBatchPostRequest.prototype.catalogType;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.ItemsBatchPostRequest.prototype.country;

/**
 * @type {!API.Client.Language}
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
 * Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
 * @type {!string}
 * @export
 */
API.Client.ItemsBatchPostRequest.prototype.catalogId;

/**
 * @type {!API.Client.BatchOperation}
 * @export
 */
API.Client.ItemsBatchPostRequest.prototype.operation;

