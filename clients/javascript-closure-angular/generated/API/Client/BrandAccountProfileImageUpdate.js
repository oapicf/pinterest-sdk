goog.provide('API.Client.BrandAccountProfileImageUpdate');

/**
 * Base64-encoded image media source
 * @record
 */
API.Client.BrandAccountProfileImageUpdate = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.BrandAccountProfileImageUpdate.prototype.contentType;

/**
 * @type {!string}
 * @export
 */
API.Client.BrandAccountProfileImageUpdate.prototype.data;

/** @enum {string} */
API.Client.BrandAccountProfileImageUpdate.ContentTypeEnum = { 
  image/jpeg: 'image/jpeg',
  image/png: 'image/png',
}
