goog.provide('API.Client.LocalInventoryItemsBatch');

/**
 * Unified model for local inventory items batch operation
 * @record
 */
API.Client.LocalInventoryItemsBatch = function() {}

/**
 * Id of the batch operation
 * @type {!string}
 * @export
 */
API.Client.LocalInventoryItemsBatch.prototype.batchId;

/**
 * Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
 * @type {!Date}
 * @export
 */
API.Client.LocalInventoryItemsBatch.prototype.completedTime;

/**
 * Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
 * @type {!Date}
 * @export
 */
API.Client.LocalInventoryItemsBatch.prototype.createdTime;

/**
 * Array of operation results
 * @type {!Array<!API.Client.SupplementalOperationResult>}
 * @export
 */
API.Client.LocalInventoryItemsBatch.prototype.operationResults;

/**
 * Status of the batch: PROCESSING, COMPLETED, FAILED
 * @type {!API.Client.SupplementalItemBatchOperationStatus}
 * @export
 */
API.Client.LocalInventoryItemsBatch.prototype.status;

