goog.provide('API.Client.AdsAnalyticsResponse_inner');

/**
 * @record
 */
API.Client.AdsAnalyticsResponseInner = function() {}

/**
 * The ID of the ad that this metrics belongs to.
 * @type {!string}
 * @export
 */
API.Client.AdsAnalyticsResponseInner.prototype.AD_ID;

/**
 * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
 * @type {!API.Client.date}
 * @export
 */
API.Client.AdsAnalyticsResponseInner.prototype.DATE;

