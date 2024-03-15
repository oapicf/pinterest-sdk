goog.provide('API.Client.PinMediaSourceVideoID');

/**
 * Video ID-based media source
 * @record
 */
API.Client.PinMediaSourceVideoID = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaSourceVideoID.prototype.sourceType;

/**
 * Cover image url.
 * @type {!string}
 * @export
 */
API.Client.PinMediaSourceVideoID.prototype.coverImageUrl;

/**
 * Content type for cover image Base64.
 * @type {!string}
 * @export
 */
API.Client.PinMediaSourceVideoID.prototype.coverImageContentType;

/**
 * Cover image Base64.
 * @type {!string}
 * @export
 */
API.Client.PinMediaSourceVideoID.prototype.coverImageData;

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaSourceVideoID.prototype.mediaId;

/**
 * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
 * @type {!boolean}
 * @export
 */
API.Client.PinMediaSourceVideoID.prototype.isStandard;

/** @enum {string} */
API.Client.PinMediaSourceVideoID.SourceTypeEnum = { 
  video_id: 'video_id',
}
/** @enum {string} */
API.Client.PinMediaSourceVideoID.CoverImageContentTypeEnum = { 
  image/jpeg: 'image/jpeg',
  image/png: 'image/png',
}
