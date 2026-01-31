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
API.Client.PinMediaWithVideo.prototype.coverImageUrl;

/**
 * Duration (in miliseconds). Field maybe null after creation due to video processing time.
 * @type {!number}
 * @export
 */
API.Client.PinMediaWithVideo.prototype.duration;

/**
 * Height (in pixels). Field maybe null after creation due to video processing time.
 * @type {!number}
 * @export
 */
API.Client.PinMediaWithVideo.prototype.height;

/**
 * @type {!API.Client.ImageSize}
 * @export
 */
API.Client.PinMediaWithVideo.prototype.images;

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaWithVideo.prototype.mediaType;

/**
 * Video url (720p).  **Note:** This field is limited and not available to all apps.
 * @type {!string}
 * @export
 */
API.Client.PinMediaWithVideo.prototype.videoUrl;

/**
 * Width (in pixels). Field maybe null after creation due to video processing time.
 * @type {!number}
 * @export
 */
API.Client.PinMediaWithVideo.prototype.width;

/** @enum {string} */
API.Client.PinMediaWithVideo.MediaTypeEnum = { 
  video: 'video',
}
