goog.provide('API.Client.AdAccountToAdAccountSharedAudience');

/**
 * @record
 */
API.Client.AdAccountToAdAccountSharedAudience = function() {}

/**
 * Unique identifier of an audience
 * @type {!string}
 * @export
 */
API.Client.AdAccountToAdAccountSharedAudience.prototype.audienceId;

/**
 * Permissions granted to the recipients.
 * @type {!Array<!API.Client.Role>}
 * @export
 */
API.Client.AdAccountToAdAccountSharedAudience.prototype.permissions;

/**
 * Ad account IDs to share with or revoke from (request) / that received the audience (response).
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdAccountToAdAccountSharedAudience.prototype.recipientAccountIds;

