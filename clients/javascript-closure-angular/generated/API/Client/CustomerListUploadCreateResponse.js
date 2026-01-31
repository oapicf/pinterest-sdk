goog.provide('API.Client.CustomerListUploadCreateResponse');

/**
 * @record
 */
API.Client.CustomerListUploadCreateResponse = function() {}

/**
 * @type {!API.Client.CustomerListUpload}
 * @export
 */
API.Client.CustomerListUploadCreateResponse.prototype.customerListUpload;

/**
 * @type {!API.Client.S3MultipartUploadData}
 * @export
 */
API.Client.CustomerListUploadCreateResponse.prototype.s3MultipartUploadData;

