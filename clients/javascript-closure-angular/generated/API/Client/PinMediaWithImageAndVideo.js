goog.provide('API.Client.PinMediaWithImageAndVideo');

/**
 * Pin with a mix of images and videos.
 * @record
 */
API.Client.PinMediaWithImageAndVideo = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaWithImageAndVideo.prototype.mediaType;

/**
 * @type {!Array<!API.Client.PinMediaMetadata>}
 * @export
 */
API.Client.PinMediaWithImageAndVideo.prototype.items;

