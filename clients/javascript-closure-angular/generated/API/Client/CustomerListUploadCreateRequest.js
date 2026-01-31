goog.provide('API.Client.CustomerListUploadCreateRequest');

/**
 * @record
 */
API.Client.CustomerListUploadCreateRequest = function() {}

/**
 * @type {!API.Client.UserListOperationType}
 * @export
 */
API.Client.CustomerListUploadCreateRequest.prototype.operation;

/**
 * Number of parts to upload the file in.
 * @type {!number}
 * @export
 */
API.Client.CustomerListUploadCreateRequest.prototype.totalParts;

