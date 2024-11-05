goog.provide('API.Client.CatalogsRetailItemsBatch');

/**
 * Object describing the catalogs retail items batch
 * @record
 */
API.Client.CatalogsRetailItemsBatch = function() {}

/**
 * Id of the catalogs items batch
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailItemsBatch.prototype.batchId;

/**
 * Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
 * @type {!Date}
 * @export
 */
API.Client.CatalogsRetailItemsBatch.prototype.createdTime;

/**
 * Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
 * @type {!Date}
 * @export
 */
API.Client.CatalogsRetailItemsBatch.prototype.completedTime;

/**
 * @type {!API.Client.BatchOperationStatus}
 * @export
 */
API.Client.CatalogsRetailItemsBatch.prototype.status;

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.CatalogsRetailItemsBatch.prototype.catalogType;

/**
 * Array with the catalogs items processing records part of the catalogs items batch
 * @type {!Array<!API.Client.ItemProcessingRecord>}
 * @export
 */
API.Client.CatalogsRetailItemsBatch.prototype.items;

