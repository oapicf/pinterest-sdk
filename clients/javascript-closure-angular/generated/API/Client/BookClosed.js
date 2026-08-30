goog.provide('API.Client.BookClosed');

/**
 * @record
 */
API.Client.BookClosed = function() {}

/**
 * Are conversion metrics ready?
 * @type {!boolean}
 * @export
 */
API.Client.BookClosed.prototype.conversionMetricsReady;

/**
 * Are non-conversion metrics ready?
 * @type {!boolean}
 * @export
 */
API.Client.BookClosed.prototype.nonConversionMetricsReady;

