goog.provide('API.Client.CustomerListUpload');

/**
 * @record
 */
API.Client.CustomerListUpload = function() {}

/**
 * Advertiser ID.
 * @type {!string}
 * @export
 */
API.Client.CustomerListUpload.prototype.adAccountId;

/**
 * Customer List Upload creation_time. Epoch (seconds).
 * @type {!number}
 * @export
 */
API.Client.CustomerListUpload.prototype.creationTime;

/**
 * ID of the customer list associated with this upload.
 * @type {!string}
 * @export
 */
API.Client.CustomerListUpload.prototype.customerListId;

/**
 * Error counts by error code
 * @type {!Array<!API.Client.ErrorDetail>}
 * @export
 */
API.Client.CustomerListUpload.prototype.errorCounts;

/**
 * Customer List Upload ID.
 * @type {!string}
 * @export
 */
API.Client.CustomerListUpload.prototype.id;

/**
 * @type {!API.Client.UserListOperationType}
 * @export
 */
API.Client.CustomerListUpload.prototype.operation;

/**
 * Record processing counts
 * @type {!API.Client.RecordCounts}
 * @export
 */
API.Client.CustomerListUpload.prototype.recordCounts;

/**
 * @type {!API.Client.WorkloadState}
 * @export
 */
API.Client.CustomerListUpload.prototype.state;

/**
 * Customer List Upload updated_time. Epoch (seconds).
 * @type {!number}
 * @export
 */
API.Client.CustomerListUpload.prototype.updatedTime;

