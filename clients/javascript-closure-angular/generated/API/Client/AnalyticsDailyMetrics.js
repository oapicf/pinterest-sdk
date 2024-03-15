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
 * The metric name and daily value for each requested metric
 * @type {!Object<!string, number>}
 * @export
 */
API.Client.AnalyticsDailyMetrics.prototype.metrics;

