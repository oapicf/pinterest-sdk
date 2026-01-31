goog.provide('API.Client.PinMediaWithImage');

/**
 * Pin with image.
 * @record
 */
API.Client.PinMediaWithImage = function() {}

/**
 * @type {!API.Client.ImageSize}
 * @export
 */
API.Client.PinMediaWithImage.prototype.images;

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaWithImage.prototype.mediaType;

/** @enum {string} */
API.Client.PinMediaWithImage.MediaTypeEnum = { 
  image: 'image',
}
