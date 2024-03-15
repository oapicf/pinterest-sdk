goog.provide('API.Client.PinMediaSource');

/**
 * Pin media source.
 * @record
 */
API.Client.PinMediaSource = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaSource.prototype.sourceType;

/**
 * @type {!string}
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
API.Client.PinMediaSource.prototype.url;

/**
 * Cover image url.
 * @type {!string}
 * @export
 */
API.Client.PinMediaSource.prototype.coverImageUrl;

/**
 * Content type for cover image Base64.
 * @type {!string}
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
 * @type {!string}
 * @export
 */
API.Client.PinMediaSource.prototype.mediaId;

/**
 * Array with image objects.
 * @type {!Array<!API.Client.PinMediaSourceImagesURL_items_inner>}
 * @export
 */
API.Client.PinMediaSource.prototype.items;

/**
 * @type {!number}
 * @export
 */
API.Client.PinMediaSource.prototype.index;

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
/** @enum {string} */
API.Client.PinMediaSource.ContentTypeEnum = { 
  image/jpeg: 'image/jpeg',
  image/png: 'image/png',
}
/** @enum {string} */
API.Client.PinMediaSource.CoverImageContentTypeEnum = { 
  image/jpeg: 'image/jpeg',
  image/png: 'image/png',
}
