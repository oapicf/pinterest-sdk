goog.provide('API.Client.TrendingPin');

/**
 * Pin image data for trending topics
 * @record
 */
API.Client.TrendingPin = function() {}

/**
 * Height of the pin image in pixels
 * @type {!number}
 * @export
 */
API.Client.TrendingPin.prototype.height;

/**
 * Unique identifier for the pin
 * @type {!string}
 * @export
 */
API.Client.TrendingPin.prototype.id;

/**
 * URL of the pin image
 * @type {!string}
 * @export
 */
API.Client.TrendingPin.prototype.src;

/**
 * Width of the pin image in pixels
 * @type {!number}
 * @export
 */
API.Client.TrendingPin.prototype.width;

