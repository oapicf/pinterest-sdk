goog.provide('API.Client.ConversionProductReport');

/**
 * @record
 */
API.Client.ConversionProductReport = function() {}

/**
 * Message returned from the create report request
 * @type {!string}
 * @export
 */
API.Client.ConversionProductReport.prototype.message;

/**
 * Async report status
 * @type {!API.Client.BulkReportingJobStatus}
 * @export
 */
API.Client.ConversionProductReport.prototype.reportStatus;

/**
 * Size of the report in bytes
 * @type {!number}
 * @export
 */
API.Client.ConversionProductReport.prototype.size;

/**
 * Token returned from the create report request
 * @type {!string}
 * @export
 */
API.Client.ConversionProductReport.prototype.token;

/**
 * URL of the report
 * @type {!string}
 * @export
 */
API.Client.ConversionProductReport.prototype.url;

