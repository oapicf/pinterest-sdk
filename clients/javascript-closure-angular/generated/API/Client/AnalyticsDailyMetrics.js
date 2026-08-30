goog.provide('API.Client.AnalyticsDailyMetrics');

/**
 * @record
 */
API.Client.AnalyticsDailyMetrics = function() {}

/**
 * @type {!API.Client.DataStatus}
 * @export
 */
API.Client.AnalyticsDailyMetrics.prototype.dataStatus;

/**
 * Metrics date (UTC): YYYY-MM-DD.
 * @type {!string}
 * @export
 */
API.Client.AnalyticsDailyMetrics.prototype.date;

/**
 * @type {!Object<!string, number>}
 * @export
 */
API.Client.AnalyticsDailyMetrics.prototype.metrics;

