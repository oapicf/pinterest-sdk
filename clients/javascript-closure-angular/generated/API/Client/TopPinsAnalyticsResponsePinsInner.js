goog.provide('API.Client.TopPinsAnalyticsResponse_pins_inner');

/**
 * Array with metrics, status, and pin id for the requested metric
 * @record
 */
API.Client.TopPinsAnalyticsResponsePinsInner = function() {}

/**
 * The metric name and daily value for each requested metric
 * @type {!Object<!string, number>}
 * @export
 */
API.Client.TopPinsAnalyticsResponsePinsInner.prototype.metrics;

/**
 * @type {!Object<!string, API.Client.DataStatus>}
 * @export
 */
API.Client.TopPinsAnalyticsResponsePinsInner.prototype.dataStatus;

/**
 * The pin id
 * @type {!string}
 * @export
 */
API.Client.TopPinsAnalyticsResponsePinsInner.prototype.pinId;

