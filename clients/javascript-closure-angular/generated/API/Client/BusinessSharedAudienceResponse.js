goog.provide('API.Client.BusinessSharedAudienceResponse');

/**
 * @record
 */
API.Client.BusinessSharedAudienceResponse = function() {}

/**
 * Audience ID that was shared
 * @type {!string}
 * @export
 */
API.Client.BusinessSharedAudienceResponse.prototype.audienceId;

/**
 * @type {!Array<!API.Client.Role>}
 * @export
 */
API.Client.BusinessSharedAudienceResponse.prototype.permissions;

/**
 * Business IDs that received the audience
 * @type {!Array<!string>}
 * @export
 */
API.Client.BusinessSharedAudienceResponse.prototype.recipientBusinessIds;

