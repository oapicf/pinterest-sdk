goog.provide('API.Client.IntegrationLogsInvalidLogResponse_rejected_logs_inner');

/**
 * @record
 */
API.Client.IntegrationLogsInvalidLogResponseRejectedLogsInner = function() {}

/**
 * Index of the log in the batch.
 * @type {!number}
 * @export
 */
API.Client.IntegrationLogsInvalidLogResponseRejectedLogsInner.prototype.logIndex;

/**
 * The field name containing an invalid value.
 * @type {!string}
 * @export
 */
API.Client.IntegrationLogsInvalidLogResponseRejectedLogsInner.prototype.field;

/**
 * The value that is invalid.
 * @type {!string}
 * @export
 */
API.Client.IntegrationLogsInvalidLogResponseRejectedLogsInner.prototype.value;

/**
 * The reason the value is invalid.
 * @type {!string}
 * @export
 */
API.Client.IntegrationLogsInvalidLogResponseRejectedLogsInner.prototype.reason;

