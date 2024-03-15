goog.provide('API.Client.BulkUpsertStatusResponse');

/**
 * ID of the bulk request.
 * @record
 */
API.Client.BulkUpsertStatusResponse = function() {}

/**
 * @type {!API.Client.BulkUpsertStatus}
 * @export
 */
API.Client.BulkUpsertStatusResponse.prototype.status;

/**
 * @type {!string}
 * @export
 */
API.Client.BulkUpsertStatusResponse.prototype.resultUrl;

