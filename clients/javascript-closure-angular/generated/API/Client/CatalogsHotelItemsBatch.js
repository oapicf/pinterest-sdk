goog.provide('API.Client.CatalogsHotelItemsBatch');

/**
 * Object describing the catalogs hotel items batch
 * @record
 */
API.Client.CatalogsHotelItemsBatch = function() {}

/**
 * Id of the catalogs items batch
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelItemsBatch.prototype.batchId;

/**
 * Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD
 * @type {!Date}
 * @export
 */
API.Client.CatalogsHotelItemsBatch.prototype.createdTime;

/**
 * Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD
 * @type {!Date}
 * @export
 */
API.Client.CatalogsHotelItemsBatch.prototype.completedTime;

/**
 * @type {!API.Client.BatchOperationStatus}
 * @export
 */
API.Client.CatalogsHotelItemsBatch.prototype.status;

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.CatalogsHotelItemsBatch.prototype.catalogType;

/**
 * Array with the catalogs items processing records part of the catalogs items batch
 * @type {!Array<!API.Client.HotelProcessingRecord>}
 * @export
 */
API.Client.CatalogsHotelItemsBatch.prototype.items;

