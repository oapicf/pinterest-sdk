goog.provide('API.Client.CatalogsHotelBatchRequest');

/**
 * Request object to update catalogs hotel items
 * @record
 */
API.Client.CatalogsHotelBatchRequest = function() {}

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.CatalogsHotelBatchRequest.prototype.catalogType;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsHotelBatchRequest.prototype.country;

/**
 * @type {!API.Client.Language}
 * @export
 */
API.Client.CatalogsHotelBatchRequest.prototype.language;

/**
 * Array with catalogs item operations
 * @type {!Array<!API.Client.CatalogsHotelBatchItem>}
 * @export
 */
API.Client.CatalogsHotelBatchRequest.prototype.items;

/**
 * Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelBatchRequest.prototype.catalogId;

