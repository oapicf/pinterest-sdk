goog.provide('API.Client.PinMediaWithVideos');

/**
 * Pin with multiple videos.
 * @record
 */
API.Client.PinMediaWithVideos = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaWithVideos.prototype.mediaType;

/**
 * @type {!Array<!API.Client.VideoMetadata>}
 * @export
 */
API.Client.PinMediaWithVideos.prototype.items;

