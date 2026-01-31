goog.provide('API.Client.Image_Base64');

/**
 * Base64-encoded image media source
 * @record
 */
API.Client.ImageBase64 = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ImageBase64.prototype.contentType;

/**
 * @type {!string}
 * @export
 */
API.Client.ImageBase64.prototype.data;

/** @enum {string} */
API.Client.ImageBase64.ContentTypeEnum = { 
  image/jpeg: 'image/jpeg',
  image/png: 'image/png',
}
