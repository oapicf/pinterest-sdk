goog.provide('API.Client.TrendingPin');

/**
 * Pin image data for trending topics
 * @record
 */
API.Client.TrendingPin = function() {}

/**
 * Dominant color of the pin image in hex format
 * @type {!string}
 * @export
 */
API.Client.TrendingPin.prototype.color;

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
 * The vertical offset of the pin image as a percentage from 0 to 100, where 0 is the top of the image and 100 is the bottom.
 * @type {!number}
 * @export
 */
API.Client.TrendingPin.prototype.verticalOffset;

/**
 * Width of the pin image in pixels
 * @type {!number}
 * @export
 */
API.Client.TrendingPin.prototype.width;

