goog.provide('API.Client.TopPinsAnalyticsResponse');

/**
 * @record
 */
API.Client.TopPinsAnalyticsResponse = function() {}

/**
 * @type {!API.Client.TopPinsAnalyticsResponse_date_availability}
 * @export
 */
API.Client.TopPinsAnalyticsResponse.prototype.dateAvailability;

/**
 * @type {!Array<!API.Client.TopPinsAnalyticsResponse_pins_inner>}
 * @export
 */
API.Client.TopPinsAnalyticsResponse.prototype.pins;

/**
 * @type {!string}
 * @export
 */
API.Client.TopPinsAnalyticsResponse.prototype.sortBy;

/** @enum {string} */
API.Client.TopPinsAnalyticsResponse.SortByEnum = { 
  ENGAGEMENT: 'ENGAGEMENT',
  SAVE: 'SAVE',
  IMPRESSION: 'IMPRESSION',
  OUTBOUND_CLICK: 'OUTBOUND_CLICK',
  PIN_CLICK: 'PIN_CLICK',
}
