goog.provide('API.Client.ImageMetadata');

/**
 * @record
 */
API.Client.ImageMetadata = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ImageMetadata.prototype.description;

/**
 * @type {!API.Client.ImageSize}
 * @export
 */
API.Client.ImageMetadata.prototype.images;

/**
 * Discriminator literal identifying this as image metadata inside a `PinMediaMetadata` payload.
 * @type {!string}
 * @export
 */
API.Client.ImageMetadata.prototype.itemType;

/**
 * @type {!string}
 * @export
 */
API.Client.ImageMetadata.prototype.link;

/**
 * @type {!string}
 * @export
 */
API.Client.ImageMetadata.prototype.title;

/** @enum {string} */
API.Client.ImageMetadata.ItemTypeEnum = { 
  image: 'image',
}
