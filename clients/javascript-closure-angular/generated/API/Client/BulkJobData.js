goog.provide('API.Client.BulkJobData');

/**
 * Bulk request result data.
 * @record
 */
API.Client.BulkJobData = function() {}

/**
 * Presigned s3 file url for the bulk request result.
 * @type {!string}
 * @export
 */
API.Client.BulkJobData.prototype.resultUrl;

/**
 * @type {!API.Client.BulkRequestStatus}
 * @export
 */
API.Client.BulkJobData.prototype.status;

/**
 * Bulk Workload Id.
 * @type {!number}
 * @export
 */
API.Client.BulkJobData.prototype.workloadId;

