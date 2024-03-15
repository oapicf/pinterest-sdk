goog.provide('API.Client.MediaUpload');

/**
 * Media upload that has been registered but not uploaded/processed yet.
 * @record
 */
API.Client.MediaUpload = function() {}

/**
 * Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
 * @type {!string}
 * @export
 */
API.Client.MediaUpload.prototype.mediaId;

/**
 * @type {!API.Client.MediaUploadType}
 * @export
 */
API.Client.MediaUpload.prototype.mediaType;

/**
 * The URL where you will POST your media file.
 * @type {!string}
 * @export
 */
API.Client.MediaUpload.prototype.uploadUrl;

/**
 * @type {!API.Client.MediaUpload_allOf_upload_parameters}
 * @export
 */
API.Client.MediaUpload.prototype.uploadParameters;

