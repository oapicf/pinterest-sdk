goog.provide('API.Client.BrandAccountProfileImage');

/**
 * Base64-encoded image media source
 * @record
 */
API.Client.BrandAccountProfileImage = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.BrandAccountProfileImage.prototype.contentType;

/**
 * @type {!string}
 * @export
 */
API.Client.BrandAccountProfileImage.prototype.data;

/** @enum {string} */
API.Client.BrandAccountProfileImage.ContentTypeEnum = { 
  image/jpeg: 'image/jpeg',
  image/png: 'image/png',
}
