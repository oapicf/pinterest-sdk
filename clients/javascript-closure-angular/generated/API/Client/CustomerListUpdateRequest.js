goog.provide('API.Client.CustomerListUpdateRequest');

/**
 * @record
 */
API.Client.CustomerListUpdateRequest = function() {}

/**
 * Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
 * @type {!string}
 * @export
 */
API.Client.CustomerListUpdateRequest.prototype.records;

/**
 * @type {!API.Client.UserListOperationType}
 * @export
 */
API.Client.CustomerListUpdateRequest.prototype.operationType;

/**
 * @type {!API.Client.Exception}
 * @export
 */
API.Client.CustomerListUpdateRequest.prototype.exceptions;

