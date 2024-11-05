goog.provide('API.Client.CatalogsItemsCreateBatchRequest');

/**
 * Request object to create catalogs items
 * @record
 */
API.Client.CatalogsItemsCreateBatchRequest = function() {}

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsItemsCreateBatchRequest.prototype.country;

/**
 * @type {!API.Client.CatalogsItemsRequest_language}
 * @export
 */
API.Client.CatalogsItemsCreateBatchRequest.prototype.language;

/**
 * @type {!API.Client.BatchOperation}
 * @export
 */
API.Client.CatalogsItemsCreateBatchRequest.prototype.operation;

/**
 * Array with catalogs items
 * @type {!Array<!API.Client.ItemCreateBatchRecord>}
 * @export
 */
API.Client.CatalogsItemsCreateBatchRequest.prototype.items;

