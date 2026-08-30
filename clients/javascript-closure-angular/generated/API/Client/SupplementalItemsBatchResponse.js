goog.provide('API.Client.SupplementalItemsBatchResponse');

/**
 * Response model for supplemental items batch operation
 * @record
 */
API.Client.SupplementalItemsBatchResponse = function() {}

/**
 * Id of the batch operation
 * @type {!string}
 * @export
 */
API.Client.SupplementalItemsBatchResponse.prototype.batchId;

/**
 * Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
 * @type {!Date}
 * @export
 */
API.Client.SupplementalItemsBatchResponse.prototype.completedTime;

/**
 * Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
 * @type {!Date}
 * @export
 */
API.Client.SupplementalItemsBatchResponse.prototype.createdTime;

/**
 * Array of operation results
 * @type {!Array<!API.Client.SupplementalOperationResult>}
 * @export
 */
API.Client.SupplementalItemsBatchResponse.prototype.operationResults;

/**
 * Status of the batch: PROCESSING, COMPLETED, FAILED
 * @type {!API.Client.SupplementalItemBatchOperationStatus}
 * @export
 */
API.Client.SupplementalItemsBatchResponse.prototype.status;

