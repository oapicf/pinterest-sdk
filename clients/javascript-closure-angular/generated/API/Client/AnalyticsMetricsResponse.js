goog.provide('API.Client.AnalyticsMetricsResponse');

/**
 * @record
 */
API.Client.AnalyticsMetricsResponse = function() {}

/**
 * Array with the requested daily metric records
 * @type {!Array<!API.Client.AnalyticsDailyMetrics>}
 * @export
 */
API.Client.AnalyticsMetricsResponse.prototype.dailyMetrics;

/**
 * The metric name and value over the requested period for each requested metric
 * @type {!Object<!string, number>}
 * @export
 */
API.Client.AnalyticsMetricsResponse.prototype.summaryMetrics;

