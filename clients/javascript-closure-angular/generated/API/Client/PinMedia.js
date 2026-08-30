goog.provide('API.Client.PinMedia');

/**
 * Pin media that can be an image, video, or a mix of both.
 * @record
 */
API.Client.PinMedia = function() {}

/**
 * @type {!API.Client.ImageSize}
 * @export
 */
API.Client.PinMedia.prototype.images;

/**
 * @type {!string}
 * @export
 */
API.Client.PinMedia.prototype.mediaType;

/**
 * @type {!string}
 * @export
 */
API.Client.PinMedia.prototype.coverImageUrl;

/**
 * Duration (in miliseconds). Field maybe null after creation due to video processing time.
 * @type {!number}
 * @export
 */
API.Client.PinMedia.prototype.duration;

/**
 * Height (in pixels). Field maybe null after creation due to video processing time.
 * @type {!number}
 * @export
 */
API.Client.PinMedia.prototype.height;

/**
 * Video url (720p).  **Note:** This field is limited and not available to all apps.
 * @type {!string}
 * @export
 */
API.Client.PinMedia.prototype.videoUrl;

/**
 * Video url (HLS).  **Note:** This field is limited and not available to all apps.
 * @type {!string}
 * @export
 */
API.Client.PinMedia.prototype.videoUrlHls;

/**
 * Width (in pixels). Field maybe null after creation due to video processing time.
 * @type {!number}
 * @export
 */
API.Client.PinMedia.prototype.width;

/**
 * @type {!Array<!API.Client.PinMediaMetadata>}
 * @export
 */
API.Client.PinMedia.prototype.items;

/** @enum {string} */
API.Client.PinMedia.MediaTypeEnum = { 
  multiple_mixed: 'multiple_mixed',
}
