goog.provide('API.Client.PinMediaMetadata');

/**
 * @record
 */
API.Client.PinMediaMetadata = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaMetadata.prototype.description;

/**
 * @type {!API.Client.ImageSize}
 * @export
 */
API.Client.PinMediaMetadata.prototype.images;

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaMetadata.prototype.itemType;

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaMetadata.prototype.link;

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaMetadata.prototype.title;

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaMetadata.prototype.coverImageUrl;

/**
 * Duration (in miliseconds). Field maybe null after creation due to video processing time.
 * @type {!number}
 * @export
 */
API.Client.PinMediaMetadata.prototype.duration;

/**
 * Height (in pixels). Field maybe null after creation due to video processing time.
 * @type {!number}
 * @export
 */
API.Client.PinMediaMetadata.prototype.height;

/**
 * Video url (720p).  **Note:** This field is limited and not available to all apps.
 * @type {!string}
 * @export
 */
API.Client.PinMediaMetadata.prototype.videoUrl;

/**
 * Width (in pixels). Field maybe null after creation due to video processing time.
 * @type {!number}
 * @export
 */
API.Client.PinMediaMetadata.prototype.width;

