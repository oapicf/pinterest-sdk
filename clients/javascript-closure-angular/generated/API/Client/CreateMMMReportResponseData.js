goog.provide('API.Client.CreateMMMReportResponseData');

/**
 * @record
 */
API.Client.CreateMMMReportResponseData = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CreateMMMReportResponseData.prototype.message;

/**
 * @type {!API.Client.BulkReportingJobStatus}
 * @export
 */
API.Client.CreateMMMReportResponseData.prototype.reportStatus;

/**
 * @type {!string}
 * @export
 */
API.Client.CreateMMMReportResponseData.prototype.status;

/**
 * @type {!string}
 * @export
 */
API.Client.CreateMMMReportResponseData.prototype.token;

