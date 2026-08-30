goog.provide('API.Client.AdAccountToBusinessSharedAudience');

/**
 * @record
 */
API.Client.AdAccountToBusinessSharedAudience = function() {}

/**
 * Unique identifier of an audience
 * @type {!string}
 * @export
 */
API.Client.AdAccountToBusinessSharedAudience.prototype.audienceId;

/**
 * Permissions granted to the recipients.
 * @type {!Array<!API.Client.Role>}
 * @export
 */
API.Client.AdAccountToBusinessSharedAudience.prototype.permissions;

/**
 * Business IDs to share with or revoke from (request) / that received the audience (response).
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdAccountToBusinessSharedAudience.prototype.recipientBusinessIds;

