goog.provide('API.Client.PinMediaWithImages');

/**
 * Pin with multiple images.
 * @record
 */
API.Client.PinMediaWithImages = function() {}

/**
 * @type {!Array<!API.Client.ImageMetadata>}
 * @export
 */
API.Client.PinMediaWithImages.prototype.items;

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaWithImages.prototype.mediaType;

/** @enum {string} */
API.Client.PinMediaWithImages.MediaTypeEnum = { 
  multiple_images: 'multiple_images',
}
