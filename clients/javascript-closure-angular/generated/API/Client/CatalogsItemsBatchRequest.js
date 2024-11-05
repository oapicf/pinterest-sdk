goog.provide('API.Client.CatalogsItemsBatchRequest');

/**
 * Request object of catalogs items batch
 * @record
 */
API.Client.CatalogsItemsBatchRequest = function() {}

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsItemsBatchRequest.prototype.country;

/**
 * @type {!API.Client.CatalogsItemsRequest_language}
 * @export
 */
API.Client.CatalogsItemsBatchRequest.prototype.language;

/**
 * @type {!API.Client.BatchOperation}
 * @export
 */
API.Client.CatalogsItemsBatchRequest.prototype.operation;

/**
 * Array with catalogs items
 * @type {!Array<!API.Client.ItemDeleteBatchRecord>}
 * @export
 */
API.Client.CatalogsItemsBatchRequest.prototype.items;

