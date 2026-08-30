goog.provide('API.Client.TopVideoPinsAnalyticsResponsePinsItems');

/**
 * Array with metrics, status, and pin id for the requested metric
 * @record
 */
API.Client.TopVideoPinsAnalyticsResponsePinsItems = function() {}

/**
 * @type {!Object<!string, API.Client.DataStatus>}
 * @export
 */
API.Client.TopVideoPinsAnalyticsResponsePinsItems.prototype.dataStatus;

/**
 * @type {!Object<!string, number>}
 * @export
 */
API.Client.TopVideoPinsAnalyticsResponsePinsItems.prototype.metrics;

/**
 * The pin id
 * @type {!string}
 * @export
 */
API.Client.TopVideoPinsAnalyticsResponsePinsItems.prototype.pinId;

