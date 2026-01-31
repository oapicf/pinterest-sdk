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
 * @type {!API.Client.RecordCounts}
 * @export
 */
API.Client.CustomerListUpload.prototype.recordCounts;

/**
 * Workload processing state
 * @type {!string}
 * @export
 */
API.Client.CustomerListUpload.prototype.state;

/**
 * Customer List Upload updated_time. Epoch (seconds).
 * @type {!number}
 * @export
 */
API.Client.CustomerListUpload.prototype.updatedTime;

/** @enum {string} */
API.Client.CustomerListUpload.StateEnum = { 
  NOT_STARTED: 'NOT_STARTED',
  RUNNING: 'RUNNING',
  PAUSED: 'PAUSED',
  SUCCEEDED: 'SUCCEEDED',
  FAILED: 'FAILED',
}
