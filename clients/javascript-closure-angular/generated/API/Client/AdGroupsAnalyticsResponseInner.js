goog.provide('API.Client.AdGroupsAnalyticsResponse_inner');

/**
 * @record
 */
API.Client.AdGroupsAnalyticsResponseInner = function() {}

/**
 * The ID of the ad group that this metrics belongs to.
 * @type {!string}
 * @export
 */
API.Client.AdGroupsAnalyticsResponseInner.prototype.AD_GROUP_ID;

/**
 * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
 * @type {!API.Client.date}
 * @export
 */
API.Client.AdGroupsAnalyticsResponseInner.prototype.DATE;

