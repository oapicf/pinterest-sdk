goog.provide('API.Client.PinMediaSourceImagesURL');

/**
 * Multiple images urls-based media source
 * @record
 */
API.Client.PinMediaSourceImagesURL = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaSourceImagesURL.prototype.sourceType;

/**
 * Array with image objects.
 * @type {!Array<!API.Client.PinMediaSourceImagesURL_items_inner>}
 * @export
 */
API.Client.PinMediaSourceImagesURL.prototype.items;

/**
 * @type {!number}
 * @export
 */
API.Client.PinMediaSourceImagesURL.prototype.index;

/** @enum {string} */
API.Client.PinMediaSourceImagesURL.SourceTypeEnum = { 
  multiple_image_urls: 'multiple_image_urls',
}
