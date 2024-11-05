goog.provide('API.Client.CatalogsItemsUpsertBatchRequest');

/**
 * Request object to upsert catalogs items
 * @record
 */
API.Client.CatalogsItemsUpsertBatchRequest = function() {}

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsItemsUpsertBatchRequest.prototype.country;

/**
 * @type {!API.Client.CatalogsItemsRequest_language}
 * @export
 */
API.Client.CatalogsItemsUpsertBatchRequest.prototype.language;

/**
 * @type {!API.Client.BatchOperation}
 * @export
 */
API.Client.CatalogsItemsUpsertBatchRequest.prototype.operation;

/**
 * Array with catalogs items
 * @type {!Array<!API.Client.ItemUpsertBatchRecord>}
 * @export
 */
API.Client.CatalogsItemsUpsertBatchRequest.prototype.items;

