goog.provide('API.Client.CatalogsItemsDeleteDiscontinuedBatchRequest');

/**
 * Request object to discontinue catalogs items
 * @record
 */
API.Client.CatalogsItemsDeleteDiscontinuedBatchRequest = function() {}

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsItemsDeleteDiscontinuedBatchRequest.prototype.country;

/**
 * @type {!API.Client.CatalogsItemsRequest_language}
 * @export
 */
API.Client.CatalogsItemsDeleteDiscontinuedBatchRequest.prototype.language;

/**
 * @type {!API.Client.BatchOperation}
 * @export
 */
API.Client.CatalogsItemsDeleteDiscontinuedBatchRequest.prototype.operation;

/**
 * Array with catalogs items
 * @type {!Array<!API.Client.ItemDeleteDiscontinuedBatchRecord>}
 * @export
 */
API.Client.CatalogsItemsDeleteDiscontinuedBatchRequest.prototype.items;

