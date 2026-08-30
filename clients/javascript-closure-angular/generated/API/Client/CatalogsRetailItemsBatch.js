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
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailItemsBatch.prototype.catalogType;

/**
 * Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
 * @type {!Date}
 * @export
 */
API.Client.CatalogsRetailItemsBatch.prototype.completedTime;

/**
 * Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss. If null, batch creation was skipped due to a recent duplicate ingestion.
 * @type {!Date}
 * @export
 */
API.Client.CatalogsRetailItemsBatch.prototype.createdTime;

/**
 * Array with the catalogs items processing records part of the catalogs items batch
 * @type {!Array<!API.Client.ItemProcessingRecord>}
 * @export
 */
API.Client.CatalogsRetailItemsBatch.prototype.items;

/**
 * @type {!API.Client.BatchOperationStatus}
 * @export
 */
API.Client.CatalogsRetailItemsBatch.prototype.status;

/** @enum {string} */
API.Client.CatalogsRetailItemsBatch.CatalogTypeEnum = { 
  RETAIL: 'RETAIL',
}
