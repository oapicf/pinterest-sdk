goog.provide('API.Client.PinAnalyticsMetricsResponse_daily_metrics_inner');

/**
 * @record
 */
API.Client.PinAnalyticsMetricsResponseDailyMetricsInner = function() {}

/**
 * @type {!API.Client.DataStatus}
 * @export
 */
API.Client.PinAnalyticsMetricsResponseDailyMetricsInner.prototype.dataStatus;

/**
 * Metrics date (UTC): YYYY-MM-DD.
 * @type {!string}
 * @export
 */
API.Client.PinAnalyticsMetricsResponseDailyMetricsInner.prototype.date;

/**
 * The metric name and daily value for each requested metric
 * @type {!Object<!string, number>}
 * @export
 */
API.Client.PinAnalyticsMetricsResponseDailyMetricsInner.prototype.metrics;

