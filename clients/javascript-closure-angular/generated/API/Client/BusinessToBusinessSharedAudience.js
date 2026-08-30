goog.provide('API.Client.BusinessToBusinessSharedAudience');

/**
 * @record
 */
API.Client.BusinessToBusinessSharedAudience = function() {}

/**
 * Unique identifier of an audience
 * @type {!string}
 * @export
 */
API.Client.BusinessToBusinessSharedAudience.prototype.audienceId;

/**
 * Permissions granted to the recipients.
 * @type {!Array<!API.Client.Role>}
 * @export
 */
API.Client.BusinessToBusinessSharedAudience.prototype.permissions;

/**
 * Business IDs to share with or revoke from (request) / that received the audience (response).
 * @type {!Array<!string>}
 * @export
 */
API.Client.BusinessToBusinessSharedAudience.prototype.recipientBusinessIds;

