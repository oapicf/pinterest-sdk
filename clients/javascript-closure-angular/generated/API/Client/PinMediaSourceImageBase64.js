goog.provide('API.Client.PinMediaSourceImageBase64');

/**
 * Base64-encoded image media source
 * @record
 */
API.Client.PinMediaSourceImageBase64 = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaSourceImageBase64.prototype.sourceType;

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaSourceImageBase64.prototype.contentType;

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaSourceImageBase64.prototype.data;

/**
 * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
 * @type {!boolean}
 * @export
 */
API.Client.PinMediaSourceImageBase64.prototype.isStandard;

/** @enum {string} */
API.Client.PinMediaSourceImageBase64.SourceTypeEnum = { 
  image_base64: 'image_base64',
}
/** @enum {string} */
API.Client.PinMediaSourceImageBase64.ContentTypeEnum = { 
  image/jpeg: 'image/jpeg',
  image/png: 'image/png',
}
