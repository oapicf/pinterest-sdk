goog.provide('API.Client.CustomerListRequest');

/**
 * @record
 */
API.Client.CustomerListRequest = function() {}

/**
 * @type {!API.Client.UserListType}
 * @export
 */
API.Client.CustomerListRequest.prototype.listType;

/**
 * Customer list name.
 * @type {!string}
 * @export
 */
API.Client.CustomerListRequest.prototype.name;

/**
 * Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
 * @type {!string}
 * @export
 */
API.Client.CustomerListRequest.prototype.records;

