goog.provide('API.Client.PinMediaSourceImagesURL');

/**
 * Multiple URL-based images media source
 * @record
 */
API.Client.PinMediaSourceImagesURL = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PinMediaSourceImagesURL.prototype.index;

/**
 * Array with image objects.
 * @type {!Array<!API.Client.PinMediaSourceImagesURLItem>}
 * @export
 */
API.Client.PinMediaSourceImagesURL.prototype.items;

/**
 * The source type of the media.
 * @type {!string}
 * @export
 */
API.Client.PinMediaSourceImagesURL.prototype.sourceType;

/** @enum {string} */
API.Client.PinMediaSourceImagesURL.SourceTypeEnum = { 
  multiple_image_urls: 'multiple_image_urls',
}
