goog.provide('API.Client.TopPinsAnalyticsResponsePinsItems');

/**
 * Array with metrics, status, and pin id for the requested metric
 * @record
 */
API.Client.TopPinsAnalyticsResponsePinsItems = function() {}

/**
 * @type {!Object<!string, API.Client.DataStatus>}
 * @export
 */
API.Client.TopPinsAnalyticsResponsePinsItems.prototype.dataStatus;

/**
 * @type {!Object<!string, number>}
 * @export
 */
API.Client.TopPinsAnalyticsResponsePinsItems.prototype.metrics;

/**
 * The pin id
 * @type {!string}
 * @export
 */
API.Client.TopPinsAnalyticsResponsePinsItems.prototype.pinId;

