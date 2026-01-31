goog.provide('API.Client.AdPinAnalytics');

/**
 * @record
 */
API.Client.AdPinAnalytics = function() {}

/**
 * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
 * @type {!API.Client.date}
 * @export
 */
API.Client.AdPinAnalytics.prototype.DATE;

/**
 * The ID of the pin that the metric belongs to.
 * @type {!string}
 * @export
 */
API.Client.AdPinAnalytics.prototype.PIN_ID;

