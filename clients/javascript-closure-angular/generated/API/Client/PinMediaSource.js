goog.provide('API.Client.PinMediaSource');

/**
 * Pin media source that can be an image, video, or a mix of both passed in as a request.
 * @record
 */
API.Client.PinMediaSource = function() {}

/**
 * @type {!API.Client.ContentType}
 * @export
 */
API.Client.PinMediaSource.prototype.contentType;

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaSource.prototype.data;

/**
 * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
 * @type {!boolean}
 * @export
 */
API.Client.PinMediaSource.prototype.isStandard;

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaSource.prototype.sourceType;

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaSource.prototype.url;

/**
 * Content type for cover image Base64.
 * @type {!API.Client.ContentType}
 * @export
 */
API.Client.PinMediaSource.prototype.coverImageContentType;

/**
 * Cover image Base64.
 * @type {!string}
 * @export
 */
API.Client.PinMediaSource.prototype.coverImageData;

/**
 * Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.
 * @type {!number}
 * @export
 */
API.Client.PinMediaSource.prototype.coverImageKeyFrameTime;

/**
 * Cover image URL.
 * @type {!string}
 * @export
 */
API.Client.PinMediaSource.prototype.coverImageUrl;

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaSource.prototype.mediaId;

/**
 * @type {!number}
 * @export
 */
API.Client.PinMediaSource.prototype.index;

/**
 * Array with image objects.
 * @type {!Array<!API.Client.PinMediaSourceImagesURLItem>}
 * @export
 */
API.Client.PinMediaSource.prototype.items;

/**
 * This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
 * @type {!boolean}
 * @export
 */
API.Client.PinMediaSource.prototype.isAffiliateLink;

/** @enum {string} */
API.Client.PinMediaSource.SourceTypeEnum = { 
  pin_url: 'pin_url',
}
