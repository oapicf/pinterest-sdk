goog.provide('API.Client.CustomerListRecordRow');

/**
 * A single row in a multi-field customer list (v2 format).
 * @record
 */
API.Client.CustomerListRecordRow = function() {}

/**
 * Email address (plain or hashed with SHA1, SHA256, or MD5).
 * @type {!string}
 * @export
 */
API.Client.CustomerListRecordRow.prototype.email;

/**
 * External ID identifier (not hashed).
 * @type {!string}
 * @export
 */
API.Client.CustomerListRecordRow.prototype.externalId;

/**
 * Hashed phone number (hashed with SHA1, SHA256, or MD5).
 * @type {!string}
 * @export
 */
API.Client.CustomerListRecordRow.prototype.hashedPhoneNumber;

/**
 * Hashed pinner ID (hashed with SHA1, SHA256, or MD5).
 * @type {!string}
 * @export
 */
API.Client.CustomerListRecordRow.prototype.hashedPinnerId;

/**
 * IP address (not hashed).
 * @type {!string}
 * @export
 */
API.Client.CustomerListRecordRow.prototype.ipAddress;

/**
 * LiveRamp envelope identifier (Base64-encoded, not hashed).
 * @type {!string}
 * @export
 */
API.Client.CustomerListRecordRow.prototype.liverampEnvelope;

/**
 * Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5).
 * @type {!string}
 * @export
 */
API.Client.CustomerListRecordRow.prototype.maid;

/**
 * User agent string (not hashed).
 * @type {!string}
 * @export
 */
API.Client.CustomerListRecordRow.prototype.userAgent;

