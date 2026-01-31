goog.provide('API.Client.TemplateBasedReport');

/**
 * @record
 */
API.Client.TemplateBasedReport = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.TemplateBasedReport.prototype.message;

/**
 * @type {!API.Client.BulkReportingJobStatus}
 * @export
 */
API.Client.TemplateBasedReport.prototype.reportStatus;

/**
 * Unique identifier of a template.
 * @type {!string}
 * @export
 */
API.Client.TemplateBasedReport.prototype.templateId;

/**
 * @type {!string}
 * @export
 */
API.Client.TemplateBasedReport.prototype.token;

