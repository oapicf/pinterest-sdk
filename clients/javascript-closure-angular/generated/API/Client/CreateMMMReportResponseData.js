goog.provide('API.Client.CreateMMMReportResponseData');

/**
 * @record
 */
API.Client.CreateMMMReportResponseData = function() {}

/**
 * @type {!API.Client.BulkReportingJobStatus}
 * @export
 */
API.Client.CreateMMMReportResponseData.prototype.reportStatus;

/**
 * @type {!string}
 * @export
 */
API.Client.CreateMMMReportResponseData.prototype.token;

/**
 * @type {!string}
 * @export
 */
API.Client.CreateMMMReportResponseData.prototype.message;

/**
 * @type {!string}
 * @export
 */
API.Client.CreateMMMReportResponseData.prototype.status;

