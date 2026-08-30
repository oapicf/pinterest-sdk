goog.provide('API.Client.TopPinsAnalyticsResponse');

/**
 * @record
 */
API.Client.TopPinsAnalyticsResponse = function() {}

/**
 * @type {!API.Client.TopPinsAnalyticsResponseDateAvailability}
 * @export
 */
API.Client.TopPinsAnalyticsResponse.prototype.dateAvailability;

/**
 * @type {!Array<!API.Client.TopPinsAnalyticsResponsePinsItems>}
 * @export
 */
API.Client.TopPinsAnalyticsResponse.prototype.pins;

/**
 * @type {!API.Client.TopPinsSortBy}
 * @export
 */
API.Client.TopPinsAnalyticsResponse.prototype.sortBy;

