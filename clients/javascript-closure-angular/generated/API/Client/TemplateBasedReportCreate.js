goog.provide('API.Client.TemplateBasedReportCreate');

/**
 * Resource create operation model.
 * @record
 */
API.Client.TemplateBasedReportCreate = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.TemplateBasedReportCreate.prototype.message;

/**
 * @type {!API.Client.BulkReportingJobStatus}
 * @export
 */
API.Client.TemplateBasedReportCreate.prototype.reportStatus;

/**
 * @type {!string}
 * @export
 */
API.Client.TemplateBasedReportCreate.prototype.token;

