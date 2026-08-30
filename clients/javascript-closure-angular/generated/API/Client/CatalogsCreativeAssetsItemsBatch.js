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
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsItemsBatch.prototype.catalogType;

/**
 * Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
 * @type {!Date}
 * @export
 */
API.Client.CatalogsCreativeAssetsItemsBatch.prototype.completedTime;

/**
 * Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
 * @type {!Date}
 * @export
 */
API.Client.CatalogsCreativeAssetsItemsBatch.prototype.createdTime;

/**
 * Array with the catalogs items processing records part of the catalogs items batch
 * @type {!Array<!API.Client.CreativeAssetsProcessingRecord>}
 * @export
 */
API.Client.CatalogsCreativeAssetsItemsBatch.prototype.items;

/**
 * @type {!API.Client.BatchOperationStatus}
 * @export
 */
API.Client.CatalogsCreativeAssetsItemsBatch.prototype.status;

/** @enum {string} */
API.Client.CatalogsCreativeAssetsItemsBatch.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
