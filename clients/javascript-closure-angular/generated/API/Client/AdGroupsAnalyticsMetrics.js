goog.provide('API.Client.AdGroupsAnalyticsMetrics');

/**
 * @record
 */
API.Client.AdGroupsAnalyticsMetrics = function() {}

/**
 * The ID of the ad group that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
 * @type {!string}
 * @export
 */
API.Client.AdGroupsAnalyticsMetrics.prototype.AD_GROUP_ID;

/**
 * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
 * @type {!API.Client.date}
 * @export
 */
API.Client.AdGroupsAnalyticsMetrics.prototype.DATE;

