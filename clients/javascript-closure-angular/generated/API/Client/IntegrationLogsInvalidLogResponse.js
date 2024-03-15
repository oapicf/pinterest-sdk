goog.provide('API.Client.IntegrationLogsInvalidLogResponse');

/**
 * Schema describing the response when a log has invalid fields.
 * @record
 */
API.Client.IntegrationLogsInvalidLogResponse = function() {}

/**
 * @type {!Array<!API.Client.IntegrationLogsInvalidLogResponse_rejected_logs_inner>}
 * @export
 */
API.Client.IntegrationLogsInvalidLogResponse.prototype.rejectedLogs;

