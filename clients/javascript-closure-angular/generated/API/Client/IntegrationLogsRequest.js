goog.provide('API.Client.IntegrationLogsRequest');

/**
 * Batch of logs sent from an integration application.
 * @record
 */
API.Client.IntegrationLogsRequest = function() {}

/**
 * @type {!Array<!API.Client.IntegrationLog>}
 * @export
 */
API.Client.IntegrationLogsRequest.prototype.logs;

