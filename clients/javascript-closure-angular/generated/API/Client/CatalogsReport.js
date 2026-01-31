goog.provide('API.Client.CatalogsReport');

/**
 * @record
 */
API.Client.CatalogsReport = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsReport.prototype.reportStatus;

/**
 * Size of the report in bytes
 * @type {!number}
 * @export
 */
API.Client.CatalogsReport.prototype.size;

/**
 * URL to download the report
 * @type {!string}
 * @export
 */
API.Client.CatalogsReport.prototype.url;

/** @enum {string} */
API.Client.CatalogsReport.ReportStatusEnum = { 
  FINISHED: 'FINISHED',
  IN_PROGRESS: 'IN_PROGRESS',
}
