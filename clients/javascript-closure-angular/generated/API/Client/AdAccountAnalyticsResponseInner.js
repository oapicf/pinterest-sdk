goog.provide('API.Client.AdAccountAnalyticsResponse_inner');

/**
 * @record
 */
API.Client.AdAccountAnalyticsResponseInner = function() {}

/**
 * The ID of the advertiser that this metrics belongs to.
 * @type {!string}
 * @export
 */
API.Client.AdAccountAnalyticsResponseInner.prototype.AD_ACCOUNT_ID;

/**
 * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
 * @type {!API.Client.date}
 * @export
 */
API.Client.AdAccountAnalyticsResponseInner.prototype.DATE;

