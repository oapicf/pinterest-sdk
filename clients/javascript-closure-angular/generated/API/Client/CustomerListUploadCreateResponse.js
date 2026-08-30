goog.provide('API.Client.CustomerListUploadCreateResponse');

/**
 * @record
 */
API.Client.CustomerListUploadCreateResponse = function() {}

/**
 * The Customer List Upload created.
 * @type {!API.Client.CustomerListUpload}
 * @export
 */
API.Client.CustomerListUploadCreateResponse.prototype.customerListUpload;

/**
 * Pre-signed upload URLs corresponding to each part of the upload.
 * @type {!API.Client.S3MultipartUploadData}
 * @export
 */
API.Client.CustomerListUploadCreateResponse.prototype.s3MultipartUploadData;

