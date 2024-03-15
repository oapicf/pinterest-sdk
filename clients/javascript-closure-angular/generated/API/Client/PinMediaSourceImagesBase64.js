goog.provide('API.Client.PinMediaSourceImagesBase64');

/**
 * Multiple Base64-encoded images media source
 * @record
 */
API.Client.PinMediaSourceImagesBase64 = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaSourceImagesBase64.prototype.sourceType;

/**
 * Array with image objects.
 * @type {!Array<!API.Client.PinMediaSourceImagesBase64_items_inner>}
 * @export
 */
API.Client.PinMediaSourceImagesBase64.prototype.items;

/**
 * @type {!number}
 * @export
 */
API.Client.PinMediaSourceImagesBase64.prototype.index;

/** @enum {string} */
API.Client.PinMediaSourceImagesBase64.SourceTypeEnum = { 
  multiple_image_base64: 'multiple_image_base64',
}
