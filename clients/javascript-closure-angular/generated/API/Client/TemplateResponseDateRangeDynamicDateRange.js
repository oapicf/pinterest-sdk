goog.provide('API.Client.TemplateResponse_date_range_dynamic_date_range');

/**
 * The dynamic date range of the template
 * @record
 */
API.Client.TemplateResponseDateRangeDynamicDateRange = function() {}

/**
 * The dynamic range type
 * @type {!string}
 * @export
 */
API.Client.TemplateResponseDateRangeDynamicDateRange.prototype.range;

/**
 * The date range type
 * @type {!string}
 * @export
 */
API.Client.TemplateResponseDateRangeDynamicDateRange.prototype.type;

/** @enum {string} */
API.Client.TemplateResponseDateRangeDynamicDateRange.RangeEnum = { 
  YEAR_TO_DATE: 'YEAR_TO_DATE',
  QUARTER_TO_DATE: 'QUARTER_TO_DATE',
  MONTH_TO_DATE: 'MONTH_TO_DATE',
  LAST_MONTH: 'LAST_MONTH',
  LAST_QUARTER: 'LAST_QUARTER',
}
