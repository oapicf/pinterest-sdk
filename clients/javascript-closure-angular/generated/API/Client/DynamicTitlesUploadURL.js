goog.provide('API.Client.DynamicTitlesUploadURL');

/**
 * @record
 */
API.Client.DynamicTitlesUploadURL = function() {}

/**
 * If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists.
 * @type {!string}
 * @export
 */
API.Client.DynamicTitlesUploadURL.prototype.existingFilename;

/**
 * Unique identifier for this upload session. Must be passed to the process endpoint.
 * @type {!string}
 * @export
 */
API.Client.DynamicTitlesUploadURL.prototype.requestId;

/**
 * Pre-signed S3 PUT URL to upload the reviewed CSV file.
 * @type {!string}
 * @export
 */
API.Client.DynamicTitlesUploadURL.prototype.uploadUrl;

