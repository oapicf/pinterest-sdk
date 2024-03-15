goog.provide('API.Client.GetMMMReportResponseData');

/**
 * @record
 */
API.Client.GetMMMReportResponseData = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.GetMMMReportResponseData.prototype.reportStatus;

/**
 * @type {!string}
 * @export
 */
API.Client.GetMMMReportResponseData.prototype.url;

/**
 * @type {!number}
 * @export
 */
API.Client.GetMMMReportResponseData.prototype.size;

/** @enum {string} */
API.Client.GetMMMReportResponseData.ReportStatusEnum = { 
  DOES_NOT_EXIST: 'DOES_NOT_EXIST',
  FINISHED: 'FINISHED',
  IN_PROGRESS: 'IN_PROGRESS',
  EXPIRED: 'EXPIRED',
  FAILED: 'FAILED',
  CANCELLED: 'CANCELLED',
}
