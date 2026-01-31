goog.provide('API.Client.Media');

/**
 * @record
 */
API.Client.Media = function() {}

/**
 * Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
 * @type {!string}
 * @export
 */
API.Client.Media.prototype.mediaId;

/**
 * @type {!API.Client.MediaUploadType}
 * @export
 */
API.Client.Media.prototype.mediaType;

/**
 * @type {!API.Client.MediaUploadStatus}
 * @export
 */
API.Client.Media.prototype.status;

