goog.provide('API.Client.VideoMetadataWithItemType');

/**
 * @record
 */
API.Client.VideoMetadataWithItemType = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.VideoMetadataWithItemType.prototype.coverImageUrl;

/**
 * Duration (in miliseconds). Field maybe null after creation due to video processing time.
 * @type {!number}
 * @export
 */
API.Client.VideoMetadataWithItemType.prototype.duration;

/**
 * Height (in pixels). Field maybe null after creation due to video processing time.
 * @type {!number}
 * @export
 */
API.Client.VideoMetadataWithItemType.prototype.height;

/**
 * Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload.
 * @type {!string}
 * @export
 */
API.Client.VideoMetadataWithItemType.prototype.itemType;

/**
 * Video url (720p).  **Note:** This field is limited and not available to all apps.
 * @type {!string}
 * @export
 */
API.Client.VideoMetadataWithItemType.prototype.videoUrl;

/**
 * Video url (HLS).  **Note:** This field is limited and not available to all apps.
 * @type {!string}
 * @export
 */
API.Client.VideoMetadataWithItemType.prototype.videoUrlHls;

/**
 * Width (in pixels). Field maybe null after creation due to video processing time.
 * @type {!number}
 * @export
 */
API.Client.VideoMetadataWithItemType.prototype.width;

/** @enum {string} */
API.Client.VideoMetadataWithItemType.ItemTypeEnum = { 
  video: 'video',
}
