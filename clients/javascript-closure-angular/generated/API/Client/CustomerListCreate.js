goog.provide('API.Client.CustomerListCreate');

/**
 * Resource create operation model.
 * @record
 */
API.Client.CustomerListCreate = function() {}

/**
 * Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.
 * @type {!boolean}
 * @export
 */
API.Client.CustomerListCreate.prototype.isNca;

/**
 * Type of customer list (e.g., EMAIL, IDFA, MAID).
 * @type {!API.Client.UserListType}
 * @export
 */
API.Client.CustomerListCreate.prototype.listType;

/**
 * Customer list name.
 * @type {!string}
 * @export
 */
API.Client.CustomerListCreate.prototype.name;

/**
 * Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
 * @type {!string}
 * @export
 */
API.Client.CustomerListCreate.prototype.records;

/**
 * Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2.
 * @type {!Array<!API.Client.CustomerListRecordRow>}
 * @export
 */
API.Client.CustomerListCreate.prototype.recordsV2;

