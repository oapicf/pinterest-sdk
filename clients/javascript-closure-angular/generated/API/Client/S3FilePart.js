goog.provide('API.Client.S3FilePart');

/**
 * @record
 */
API.Client.S3FilePart = function() {}

/**
 * Part number for upload.
 * @type {!number}
 * @export
 */
API.Client.S3FilePart.prototype.partNumber;

/**
 * Pre-signed URL.
 * @type {!string}
 * @export
 */
API.Client.S3FilePart.prototype.presignedUrl;

