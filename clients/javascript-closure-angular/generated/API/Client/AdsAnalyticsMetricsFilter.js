goog.provide('API.Client.AdsAnalyticsMetricsFilter');

/**
 * @record
 */
API.Client.AdsAnalyticsMetricsFilter = function() {}

/**
 * @type {!API.Client.AdsAnalyticsFilterColumn}
 * @export
 */
API.Client.AdsAnalyticsMetricsFilter.prototype.field;

/**
 * @type {!API.Client.AdsAnalyticsFilterOperator}
 * @export
 */
API.Client.AdsAnalyticsMetricsFilter.prototype.operator;

/**
 * List of values for filtering
 * @type {!Array<!number>}
 * @export
 */
API.Client.AdsAnalyticsMetricsFilter.prototype.values;

