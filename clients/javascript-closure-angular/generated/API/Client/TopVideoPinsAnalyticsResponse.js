goog.provide('API.Client.TopVideoPinsAnalyticsResponse');

/**
 * @record
 */
API.Client.TopVideoPinsAnalyticsResponse = function() {}

/**
 * @type {!API.Client.TopPinsAnalyticsResponse_date_availability}
 * @export
 */
API.Client.TopVideoPinsAnalyticsResponse.prototype.dateAvailability;

/**
 * @type {!Array<!API.Client.TopVideoPinsAnalyticsResponse_pins_inner>}
 * @export
 */
API.Client.TopVideoPinsAnalyticsResponse.prototype.pins;

/**
 * @type {!string}
 * @export
 */
API.Client.TopVideoPinsAnalyticsResponse.prototype.sortBy;

/** @enum {string} */
API.Client.TopVideoPinsAnalyticsResponse.SortByEnum = { 
  SAVE: 'SAVE',
  IMPRESSION: 'IMPRESSION',
  OUTBOUND_CLICK: 'OUTBOUND_CLICK',
  VIDEO_MRC_VIEW: 'VIDEO_MRC_VIEW',
  VIDEO_AVG_WATCH_TIME: 'VIDEO_AVG_WATCH_TIME',
  VIDEO_V50_WATCH_TIME: 'VIDEO_V50_WATCH_TIME',
  QUARTILE_95_PERCENT_VIEW: 'QUARTILE_95_PERCENT_VIEW',
  VIDEO_10S_VIEW: 'VIDEO_10S_VIEW',
  VIDEO_START: 'VIDEO_START',
}
