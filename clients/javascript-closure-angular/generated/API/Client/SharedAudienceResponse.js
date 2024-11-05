goog.provide('API.Client.SharedAudienceResponse');

/**
 * @record
 */
API.Client.SharedAudienceResponse = function() {}

/**
 * Audience ID that was shared
 * @type {!string}
 * @export
 */
API.Client.SharedAudienceResponse.prototype.audienceId;

/**
 * @type {!Array<!API.Client.Role>}
 * @export
 */
API.Client.SharedAudienceResponse.prototype.permissions;

/**
 * Account IDs that received the audience
 * @type {!Array<!string>}
 * @export
 */
API.Client.SharedAudienceResponse.prototype.recipientAccountIds;

