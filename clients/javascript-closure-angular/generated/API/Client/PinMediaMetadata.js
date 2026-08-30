goog.provide('API.Client.PinMediaMetadata');

/**
 * Per-item entry inside `PinMedia.items` for mixed image/video pins. Discriminated by `item_type`.
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
 * Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload.
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
 * Video url (HLS).  **Note:** This field is limited and not available to all apps.
 * @type {!string}
 * @export
 */
API.Client.PinMediaMetadata.prototype.videoUrlHls;

/**
 * Width (in pixels). Field maybe null after creation due to video processing time.
 * @type {!number}
 * @export
 */
API.Client.PinMediaMetadata.prototype.width;

/** @enum {string} */
API.Client.PinMediaMetadata.ItemTypeEnum = { 
  video: 'video',
}
