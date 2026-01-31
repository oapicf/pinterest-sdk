goog.provide('API.Client.IntegrationLogsInvalidLogResponse_rejected_logs_inner');

/**
 * @record
 */
API.Client.IntegrationLogsInvalidLogResponseRejectedLogsInner = function() {}

/**
 * The field name containing an invalid value.
 * @type {!string}
 * @export
 */
API.Client.IntegrationLogsInvalidLogResponseRejectedLogsInner.prototype.field;

/**
 * Index of the log in the batch.
 * @type {!number}
 * @export
 */
API.Client.IntegrationLogsInvalidLogResponseRejectedLogsInner.prototype.logIndex;

/**
 * The reason the value is invalid.
 * @type {!string}
 * @export
 */
API.Client.IntegrationLogsInvalidLogResponseRejectedLogsInner.prototype.reason;

/**
 * The value that is invalid.
 * @type {!string}
 * @export
 */
API.Client.IntegrationLogsInvalidLogResponseRejectedLogsInner.prototype.value;

