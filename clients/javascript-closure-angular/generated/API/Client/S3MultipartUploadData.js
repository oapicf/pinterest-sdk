goog.provide('API.Client.S3MultipartUploadData');

/**
 * @record
 */
API.Client.S3MultipartUploadData = function() {}

/**
 * Array of file parts with pre-signed URLs.
 * @type {!Array<!API.Client.S3FilePart>}
 * @export
 */
API.Client.S3MultipartUploadData.prototype.fileParts;

