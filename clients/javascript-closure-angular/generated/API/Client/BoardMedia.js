goog.provide('API.Client.Board_media');

/**
 * Board media.
 * @record
 */
API.Client.BoardMedia = function() {}

/**
 * Board cover image.
 * @type {!string}
 * @export
 */
API.Client.BoardMedia.prototype.imageCoverUrl;

/**
 * Board pin thumbnail urls.
 * @type {!Array<!string>}
 * @export
 */
API.Client.BoardMedia.prototype.pinThumbnailUrls;

