goog.provide('API.Client.CustomerListUpdateWithRequiredBody');

/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 * @record
 */
API.Client.CustomerListUpdateWithRequiredBody = function() {}

/**
 * Customer list update operation type (add or remove). Only valid in update request body.
 * @type {!API.Client.UserListOperationType}
 * @export
 */
API.Client.CustomerListUpdateWithRequiredBody.prototype.operationType;

/**
 * Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
 * @type {!string}
 * @export
 */
API.Client.CustomerListUpdateWithRequiredBody.prototype.records;

/**
 * Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2.
 * @type {!Array<!API.Client.CustomerListRecordRow>}
 * @export
 */
API.Client.CustomerListUpdateWithRequiredBody.prototype.recordsV2;

