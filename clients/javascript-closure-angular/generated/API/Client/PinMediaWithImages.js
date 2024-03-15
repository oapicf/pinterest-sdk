goog.provide('API.Client.PinMediaWithImages');

/**
 * Pin with multiple images.
 * @record
 */
API.Client.PinMediaWithImages = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaWithImages.prototype.mediaType;

/**
 * @type {!Array<!API.Client.ImageMetadata>}
 * @export
 */
API.Client.PinMediaWithImages.prototype.items;

