goog.provide('API.Client.BusinessToAdAccountSharedAudience');

/**
 * @record
 */
API.Client.BusinessToAdAccountSharedAudience = function() {}

/**
 * Unique identifier of an audience
 * @type {!string}
 * @export
 */
API.Client.BusinessToAdAccountSharedAudience.prototype.audienceId;

/**
 * Permissions granted to the recipients.
 * @type {!Array<!API.Client.Role>}
 * @export
 */
API.Client.BusinessToAdAccountSharedAudience.prototype.permissions;

/**
 * Ad account IDs to share with or revoke from (request) / that received the audience (response).
 * @type {!Array<!string>}
 * @export
 */
API.Client.BusinessToAdAccountSharedAudience.prototype.recipientAccountIds;

