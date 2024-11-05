goog.provide('API.Client.CatalogsCreativeAssetsItemsBatch');

/**
 * Object describing the catalogs creative assets items batch
 * @record
 */
API.Client.CatalogsCreativeAssetsItemsBatch = function() {}

/**
 * Id of the catalogs items batch
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsItemsBatch.prototype.batchId;

/**
 * Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
 * @type {!Date}
 * @export
 */
API.Client.CatalogsCreativeAssetsItemsBatch.prototype.createdTime;

/**
 * Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
 * @type {!Date}
 * @export
 */
API.Client.CatalogsCreativeAssetsItemsBatch.prototype.completedTime;

/**
 * @type {!API.Client.BatchOperationStatus}
 * @export
 */
API.Client.CatalogsCreativeAssetsItemsBatch.prototype.status;

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.CatalogsCreativeAssetsItemsBatch.prototype.catalogType;

/**
 * Array with the catalogs items processing records part of the catalogs items batch
 * @type {!Array<!API.Client.CreativeAssetsProcessingRecord>}
 * @export
 */
API.Client.CatalogsCreativeAssetsItemsBatch.prototype.items;

