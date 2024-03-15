goog.provide('API.Client.BookClosedResponse');

/**
 * Creation fields
 * @record
 */
API.Client.BookClosedResponse = function() {}

/**
 * Are conversion metrics ready?
 * @type {!boolean}
 * @export
 */
API.Client.BookClosedResponse.prototype.conversionMetricsReady;

/**
 * Are non-conversion metrics ready?
 * @type {!boolean}
 * @export
 */
API.Client.BookClosedResponse.prototype.nonConversionMetricsReady;

