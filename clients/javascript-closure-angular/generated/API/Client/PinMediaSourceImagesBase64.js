goog.provide('API.Client.PinMediaSourceImagesBase64');

/**
 * Multiple Base64-based images media source
 * @record
 */
API.Client.PinMediaSourceImagesBase64 = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PinMediaSourceImagesBase64.prototype.index;

/**
 * Array with image objects.
 * @type {!Array<!API.Client.PinMediaSourceImagesBase64Item>}
 * @export
 */
API.Client.PinMediaSourceImagesBase64.prototype.items;

/**
 * The source type of the media.
 * @type {!string}
 * @export
 */
API.Client.PinMediaSourceImagesBase64.prototype.sourceType;

/** @enum {string} */
API.Client.PinMediaSourceImagesBase64.SourceTypeEnum = { 
  multiple_image_base64: 'multiple_image_base64',
}
