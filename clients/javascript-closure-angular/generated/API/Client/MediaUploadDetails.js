goog.provide('API.Client.MediaUploadDetails');

/**
 * Media upload details
 * @record
 */
API.Client.MediaUploadDetails = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.MediaUploadDetails.prototype.mediaId;

/**
 * @type {!API.Client.MediaUploadType}
 * @export
 */
API.Client.MediaUploadDetails.prototype.mediaType;

/**
 * @type {!API.Client.MediaUploadStatus}
 * @export
 */
API.Client.MediaUploadDetails.prototype.status;

