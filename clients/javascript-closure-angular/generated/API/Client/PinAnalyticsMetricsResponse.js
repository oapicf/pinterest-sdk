goog.provide('API.Client.PinAnalyticsMetricsResponse');

/**
 * @record
 */
API.Client.PinAnalyticsMetricsResponse = function() {}

/**
 * Array with the requested daily metric records
 * @type {!Array<!API.Client.PinAnalyticsMetricsResponse_daily_metrics_inner>}
 * @export
 */
API.Client.PinAnalyticsMetricsResponse.prototype.dailyMetrics;

/**
 * The lifetime metric name and value.
 * @type {!Object<!string, number>}
 * @export
 */
API.Client.PinAnalyticsMetricsResponse.prototype.lifetimeMetrics;

/**
 * The metric name and value over the requested period for each requested metric
 * @type {!Object<!string, number>}
 * @export
 */
API.Client.PinAnalyticsMetricsResponse.prototype.summaryMetrics;

