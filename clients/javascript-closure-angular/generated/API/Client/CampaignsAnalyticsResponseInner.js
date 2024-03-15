goog.provide('API.Client.CampaignsAnalyticsResponse_inner');

/**
 * @record
 */
API.Client.CampaignsAnalyticsResponseInner = function() {}

/**
 * The ID of the campaing that this metrics belongs to.
 * @type {!string}
 * @export
 */
API.Client.CampaignsAnalyticsResponseInner.prototype.CAMPAIGN_ID;

/**
 * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
 * @type {!API.Client.date}
 * @export
 */
API.Client.CampaignsAnalyticsResponseInner.prototype.DATE;

