goog.provide('API.Client.CatalogsHotelItemsBatch');

/**
 * Object describing the catalogs hotel items batch. If specified, you must provide all properties.
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
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelItemsBatch.prototype.catalogType;

/**
 * Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
 * @type {!Date}
 * @export
 */
API.Client.CatalogsHotelItemsBatch.prototype.completedTime;

/**
 * Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
 * @type {!Date}
 * @export
 */
API.Client.CatalogsHotelItemsBatch.prototype.createdTime;

/**
 * Array with the catalogs items processing records part of the catalogs items batch
 * @type {!Array<!API.Client.HotelProcessingRecord>}
 * @export
 */
API.Client.CatalogsHotelItemsBatch.prototype.items;

/**
 * @type {!API.Client.BatchOperationStatus}
 * @export
 */
API.Client.CatalogsHotelItemsBatch.prototype.status;

/** @enum {string} */
API.Client.CatalogsHotelItemsBatch.CatalogTypeEnum = { 
  HOTEL: 'HOTEL',
}
