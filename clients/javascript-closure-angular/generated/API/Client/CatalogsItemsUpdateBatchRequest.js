goog.provide('API.Client.CatalogsItemsUpdateBatchRequest');

/**
 * Request object to update catalogs items
 * @record
 */
API.Client.CatalogsItemsUpdateBatchRequest = function() {}

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsItemsUpdateBatchRequest.prototype.country;

/**
 * @type {!API.Client.Language}
 * @export
 */
API.Client.CatalogsItemsUpdateBatchRequest.prototype.language;

/**
 * @type {!API.Client.BatchOperation}
 * @export
 */
API.Client.CatalogsItemsUpdateBatchRequest.prototype.operation;

/**
 * Array with catalogs items
 * @type {!Array<!API.Client.ItemUpdateBatchRecord>}
 * @export
 */
API.Client.CatalogsItemsUpdateBatchRequest.prototype.items;

