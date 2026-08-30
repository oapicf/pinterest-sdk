goog.provide('API.Client.TopVideoPinsAnalyticsResponse');

/**
 * @record
 */
API.Client.TopVideoPinsAnalyticsResponse = function() {}

/**
 * @type {!API.Client.TopVideoPinsAnalyticsResponseDateAvailability}
 * @export
 */
API.Client.TopVideoPinsAnalyticsResponse.prototype.dateAvailability;

/**
 * @type {!Array<!API.Client.TopVideoPinsAnalyticsResponsePinsItems>}
 * @export
 */
API.Client.TopVideoPinsAnalyticsResponse.prototype.pins;

/**
 * @type {!API.Client.TopVideoPinsSortBy}
 * @export
 */
API.Client.TopVideoPinsAnalyticsResponse.prototype.sortBy;

