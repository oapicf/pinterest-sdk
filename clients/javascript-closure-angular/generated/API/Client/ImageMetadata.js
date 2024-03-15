goog.provide('API.Client.ImageMetadata');

/**
 * @record
 */
API.Client.ImageMetadata = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ImageMetadata.prototype.itemType;

/**
 * @type {!string}
 * @export
 */
API.Client.ImageMetadata.prototype.title;

/**
 * @type {!string}
 * @export
 */
API.Client.ImageMetadata.prototype.description;

/**
 * @type {!string}
 * @export
 */
API.Client.ImageMetadata.prototype.link;

/**
 * @type {!API.Client.ImageMetadata_images}
 * @export
 */
API.Client.ImageMetadata.prototype.images;

