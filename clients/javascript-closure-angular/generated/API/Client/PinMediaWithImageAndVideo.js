goog.provide('API.Client.PinMediaWithImageAndVideo');

/**
 * Pin with a mix of images and videos.
 * @record
 */
API.Client.PinMediaWithImageAndVideo = function() {}

/**
 * @type {!Array<!API.Client.PinMediaMetadata>}
 * @export
 */
API.Client.PinMediaWithImageAndVideo.prototype.items;

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaWithImageAndVideo.prototype.mediaType;

/** @enum {string} */
API.Client.PinMediaWithImageAndVideo.MediaTypeEnum = { 
  multiple_mixed: 'multiple_mixed',
}
