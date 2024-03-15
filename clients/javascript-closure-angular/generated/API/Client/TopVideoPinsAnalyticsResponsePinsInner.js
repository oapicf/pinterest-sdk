goog.provide('API.Client.TopVideoPinsAnalyticsResponse_pins_inner');

/**
 * Array with metrics, status, and pin id for the requested metric
 * @record
 */
API.Client.TopVideoPinsAnalyticsResponsePinsInner = function() {}

/**
 * The metric name and daily value for each requested metric
 * @type {!Object<!string, number>}
 * @export
 */
API.Client.TopVideoPinsAnalyticsResponsePinsInner.prototype.metrics;

/**
 * @type {!Object<!string, API.Client.DataStatus>}
 * @export
 */
API.Client.TopVideoPinsAnalyticsResponsePinsInner.prototype.dataStatus;

/**
 * The pin id
 * @type {!string}
 * @export
 */
API.Client.TopVideoPinsAnalyticsResponsePinsInner.prototype.pinId;

