goog.provide('API.Client.PinMediaSourceVideoID');

/**
 * Video ID-based media source.
 * @record
 */
API.Client.PinMediaSourceVideoID = function() {}

/**
 * Content type for cover image Base64.
 * @type {!API.Client.ContentType}
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
 * Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.
 * @type {!number}
 * @export
 */
API.Client.PinMediaSourceVideoID.prototype.coverImageKeyFrameTime;

/**
 * Cover image URL.
 * @type {!string}
 * @export
 */
API.Client.PinMediaSourceVideoID.prototype.coverImageUrl;

/**
 * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
 * @type {!boolean}
 * @export
 */
API.Client.PinMediaSourceVideoID.prototype.isStandard;

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaSourceVideoID.prototype.mediaId;

/**
 * @type {!string}
 * @export
 */
API.Client.PinMediaSourceVideoID.prototype.sourceType;

/** @enum {string} */
API.Client.PinMediaSourceVideoID.SourceTypeEnum = { 
  video_id: 'video_id',
}
