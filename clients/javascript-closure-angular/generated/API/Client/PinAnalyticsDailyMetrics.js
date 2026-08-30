goog.provide('API.Client.PinAnalyticsDailyMetrics');

/**
 * @record
 */
API.Client.PinAnalyticsDailyMetrics = function() {}

/**
 * @type {!API.Client.DataStatus}
 * @export
 */
API.Client.PinAnalyticsDailyMetrics.prototype.dataStatus;

/**
 * Metrics date (UTC): YYYY-MM-DD.
 * @type {!string}
 * @export
 */
API.Client.PinAnalyticsDailyMetrics.prototype.date;

/**
 * @type {!Object<!string, number>}
 * @export
 */
API.Client.PinAnalyticsDailyMetrics.prototype.metrics;

