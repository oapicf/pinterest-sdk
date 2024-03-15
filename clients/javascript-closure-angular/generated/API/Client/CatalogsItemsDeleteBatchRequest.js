goog.provide('API.Client.CatalogsItemsDeleteBatchRequest');

/**
 * Request object to delete catalogs items
 * @record
 */
API.Client.CatalogsItemsDeleteBatchRequest = function() {}

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsItemsDeleteBatchRequest.prototype.country;

/**
 * @type {!API.Client.Language}
 * @export
 */
API.Client.CatalogsItemsDeleteBatchRequest.prototype.language;

/**
 * @type {!API.Client.BatchOperation}
 * @export
 */
API.Client.CatalogsItemsDeleteBatchRequest.prototype.operation;

/**
 * Array with catalogs items
 * @type {!Array<!API.Client.ItemDeleteBatchRecord>}
 * @export
 */
API.Client.CatalogsItemsDeleteBatchRequest.prototype.items;

