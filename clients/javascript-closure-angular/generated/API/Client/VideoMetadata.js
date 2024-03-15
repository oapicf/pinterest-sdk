goog.provide('API.Client.VideoMetadata');

/**
 * @record
 */
API.Client.VideoMetadata = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.VideoMetadata.prototype.itemType;

/**
 * @type {!string}
 * @export
 */
API.Client.VideoMetadata.prototype.coverImageUrl;

/**
 * Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps.
 * @type {!string}
 * @export
 */
API.Client.VideoMetadata.prototype.videoUrl;

/**
 * Duration (in milliseconds)
 * @type {!number}
 * @export
 */
API.Client.VideoMetadata.prototype.duration;

/**
 * Height (in pixels)
 * @type {!number}
 * @export
 */
API.Client.VideoMetadata.prototype.height;

/**
 * Width (in pixels)
 * @type {!number}
 * @export
 */
API.Client.VideoMetadata.prototype.width;

