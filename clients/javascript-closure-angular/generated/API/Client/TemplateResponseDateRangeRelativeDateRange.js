goog.provide('API.Client.TemplateResponse_date_range_relative_date_range');

/**
 * The relative date range of the template
 * @record
 */
API.Client.TemplateResponseDateRangeRelativeDateRange = function() {}

/**
 * The date range type
 * @type {!string}
 * @export
 */
API.Client.TemplateResponseDateRangeRelativeDateRange.prototype.type;

/**
 * The start date of the date range
 * @type {!number}
 * @export
 */
API.Client.TemplateResponseDateRangeRelativeDateRange.prototype.startDaysInPast;

/**
 * The end date of the date range
 * @type {!number}
 * @export
 */
API.Client.TemplateResponseDateRangeRelativeDateRange.prototype.endDaysInPast;

