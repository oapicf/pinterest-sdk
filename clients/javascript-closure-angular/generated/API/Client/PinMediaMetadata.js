goog.provide('API.Client.PinMediaMetadata');

/**
 * @record
 */
API.Client.PinMediaMetadata = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaMetadata.prototype.itemType;

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaMetadata.prototype.title;

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaMetadata.prototype.description;

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaMetadata.prototype.link;

/**
 * @type {!API.Client.ImageMetadata_images}
 * @export
 */
API.Client.PinMediaMetadata.prototype.images;

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaMetadata.prototype.coverImageUrl;

/**
 * Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps.
 * @type {!string}
 * @export
 */
API.Client.PinMediaMetadata.prototype.videoUrl;

/**
 * Duration (in milliseconds)
 * @type {!number}
 * @export
 */
API.Client.PinMediaMetadata.prototype.duration;

/**
 * Height (in pixels)
 * @type {!number}
 * @export
 */
API.Client.PinMediaMetadata.prototype.height;

/**
 * Width (in pixels)
 * @type {!number}
 * @export
 */
API.Client.PinMediaMetadata.prototype.width;

