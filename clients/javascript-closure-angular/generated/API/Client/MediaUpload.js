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
 * The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
 * @type {!API.Client.MediaUploadParameters}
 * @export
 */
API.Client.MediaUpload.prototype.uploadParameters;

/**
 * The URL where you will POST your media file.
 * @type {!string}
 * @export
 */
API.Client.MediaUpload.prototype.uploadUrl;

