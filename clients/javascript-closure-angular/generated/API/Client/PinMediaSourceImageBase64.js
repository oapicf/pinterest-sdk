goog.provide('API.Client.PinMediaSourceImageBase64');

/**
 * Image Base64-based media source.
 * @record
 */
API.Client.PinMediaSourceImageBase64 = function() {}

/**
 * @type {!API.Client.ContentType}
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

/**
 * The source type of the media.
 * @type {!string}
 * @export
 */
API.Client.PinMediaSourceImageBase64.prototype.sourceType;

/** @enum {string} */
API.Client.PinMediaSourceImageBase64.SourceTypeEnum = { 
  image_base64: 'image_base64',
}
