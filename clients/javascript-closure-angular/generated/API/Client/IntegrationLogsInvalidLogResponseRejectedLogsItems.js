goog.provide('API.Client.IntegrationLogsInvalidLogResponseRejectedLogsItems');

/**
 * @record
 */
API.Client.IntegrationLogsInvalidLogResponseRejectedLogsItems = function() {}

/**
 * The field name containing an invalid value.
 * @type {!string}
 * @export
 */
API.Client.IntegrationLogsInvalidLogResponseRejectedLogsItems.prototype.field;

/**
 * Index of the log in the batch.
 * @type {!number}
 * @export
 */
API.Client.IntegrationLogsInvalidLogResponseRejectedLogsItems.prototype.logIndex;

/**
 * The reason the value is invalid.
 * @type {!string}
 * @export
 */
API.Client.IntegrationLogsInvalidLogResponseRejectedLogsItems.prototype.reason;

/**
 * The value that is invalid.
 * @type {!string}
 * @export
 */
API.Client.IntegrationLogsInvalidLogResponseRejectedLogsItems.prototype.value;

