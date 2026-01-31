goog.provide('API.Client.CustomerListUploadResponse');

/**
 * @record
 */
API.Client.CustomerListUploadResponse = function() {}

/**
 * Advertiser ID.
 * @type {!string}
 * @export
 */
API.Client.CustomerListUploadResponse.prototype.adAccountId;

/**
 * Customer List Upload creation_time. Epoch (seconds).
 * @type {!number}
 * @export
 */
API.Client.CustomerListUploadResponse.prototype.creationTime;

/**
 * ID of the customer list associated with this upload.
 * @type {!string}
 * @export
 */
API.Client.CustomerListUploadResponse.prototype.customerListId;

/**
 * Error counts by error code
 * @type {!Array<!API.Client.ErrorDetail>}
 * @export
 */
API.Client.CustomerListUploadResponse.prototype.errorCounts;

/**
 * Customer List Upload ID.
 * @type {!string}
 * @export
 */
API.Client.CustomerListUploadResponse.prototype.id;

/**
 * @type {!API.Client.UserListOperationType}
 * @export
 */
API.Client.CustomerListUploadResponse.prototype.operation;

/**
 * @type {!API.Client.RecordCounts}
 * @export
 */
API.Client.CustomerListUploadResponse.prototype.recordCounts;

/**
 * Workload processing state
 * @type {!string}
 * @export
 */
API.Client.CustomerListUploadResponse.prototype.state;

/**
 * Customer List Upload updated_time. Epoch (seconds).
 * @type {!number}
 * @export
 */
API.Client.CustomerListUploadResponse.prototype.updatedTime;

/** @enum {string} */
API.Client.CustomerListUploadResponse.StateEnum = { 
  NOT_STARTED: 'NOT_STARTED',
  RUNNING: 'RUNNING',
  PAUSED: 'PAUSED',
  SUCCEEDED: 'SUCCEEDED',
  FAILED: 'FAILED',
}
