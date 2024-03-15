goog.provide('API.Client.CatalogsVerticalBatchRequest');

/**
 * A request object that can have multiple operations on a single batch
 * @record
 */
API.Client.CatalogsVerticalBatchRequest = function() {}

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.CatalogsVerticalBatchRequest.prototype.catalogType;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsVerticalBatchRequest.prototype.country;

/**
 * @type {!API.Client.Language}
 * @export
 */
API.Client.CatalogsVerticalBatchRequest.prototype.language;

/**
 * Array with catalogs item operations
 * @type {!Array<!API.Client.CatalogsHotelBatchItem>}
 * @export
 */
API.Client.CatalogsVerticalBatchRequest.prototype.items;

/**
 * Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalBatchRequest.prototype.catalogId;

