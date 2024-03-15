goog.provide('API.Client.CatalogsRetailBatchRequest');

/**
 * A request object that can have multiple operations on a single retail batch
 * @record
 */
API.Client.CatalogsRetailBatchRequest = function() {}

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.CatalogsRetailBatchRequest.prototype.catalogType;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsRetailBatchRequest.prototype.country;

/**
 * @type {!API.Client.Language}
 * @export
 */
API.Client.CatalogsRetailBatchRequest.prototype.language;

/**
 * Array with catalogs item operations
 * @type {!Array<!API.Client.CatalogsRetailBatchRequest_items_inner>}
 * @export
 */
API.Client.CatalogsRetailBatchRequest.prototype.items;

