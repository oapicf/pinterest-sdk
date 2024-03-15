goog.provide('API.Client.PinMediaWithVideo');

/**
 * Pin with video.
 * @record
 */
API.Client.PinMediaWithVideo = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaWithVideo.prototype.mediaType;

/**
 * @type {!API.Client.ImageMetadata_images}
 * @export
 */
API.Client.PinMediaWithVideo.prototype.images;

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaWithVideo.prototype.coverImageUrl;

/**
 * Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps.
 * @type {!string}
 * @export
 */
API.Client.PinMediaWithVideo.prototype.videoUrl;

/**
 * Duration (in milliseconds)
 * @type {!number}
 * @export
 */
API.Client.PinMediaWithVideo.prototype.duration;

/**
 * Height (in pixels)
 * @type {!number}
 * @export
 */
API.Client.PinMediaWithVideo.prototype.height;

/**
 * Width (in pixels)
 * @type {!number}
 * @export
 */
API.Client.PinMediaWithVideo.prototype.width;

