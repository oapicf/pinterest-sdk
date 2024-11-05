goog.provide('API.Client.SharedAudienceResponseCommon');

/**
 * @record
 */
API.Client.SharedAudienceResponseCommon = function() {}

/**
 * Audience ID that was shared
 * @type {!string}
 * @export
 */
API.Client.SharedAudienceResponseCommon.prototype.audienceId;

/**
 * @type {!Array<!API.Client.Role>}
 * @export
 */
API.Client.SharedAudienceResponseCommon.prototype.permissions;

