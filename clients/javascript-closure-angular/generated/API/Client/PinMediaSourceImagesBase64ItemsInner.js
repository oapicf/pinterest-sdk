goog.provide('API.Client.PinMediaSourceImagesBase64_items_inner');

/**
 * @record
 */
API.Client.PinMediaSourceImagesBase64ItemsInner = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaSourceImagesBase64ItemsInner.prototype.title;

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaSourceImagesBase64ItemsInner.prototype.description;

/**
 * Destination link for the image.
 * @type {!string}
 * @export
 */
API.Client.PinMediaSourceImagesBase64ItemsInner.prototype.link;

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaSourceImagesBase64ItemsInner.prototype.contentType;

/**
 * Image to upload as base64 string.
 * @type {!string}
 * @export
 */
API.Client.PinMediaSourceImagesBase64ItemsInner.prototype.data;

/** @enum {string} */
API.Client.PinMediaSourceImagesBase64ItemsInner.ContentTypeEnum = { 
  image/jpeg: 'image/jpeg',
  image/png: 'image/png',
}
