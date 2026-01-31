goog.provide('API.Client.reports_stats_200_response');

/**
 * @record
 */
API.Client.ReportsStats200Response = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ReportsStats200Response.prototype.bookmark;

/**
 * @type {!Array<!API.Client.CatalogsReportStats>}
 * @export
 */
API.Client.ReportsStats200Response.prototype.items;

