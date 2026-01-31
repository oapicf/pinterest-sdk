goog.provide('API.Client.PinMediaWithVideos');

/**
 * Pin with multiple videos.
 * @record
 */
API.Client.PinMediaWithVideos = function() {}

/**
 * @type {!Array<!API.Client.VideoMetadataWithItemType>}
 * @export
 */
API.Client.PinMediaWithVideos.prototype.items;

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaWithVideos.prototype.mediaType;

/** @enum {string} */
API.Client.PinMediaWithVideos.MediaTypeEnum = { 
  multiple_videos: 'multiple_videos',
}
