goog.provide('API.Client.AudienceCommon');

/**
 * @record
 */
API.Client.AudienceCommon = function() {}

/**
 * Ad account ID.
 * @type {!string}
 * @export
 */
API.Client.AudienceCommon.prototype.adAccountId;

/**
 * Audience name.
 * @type {!string}
 * @export
 */
API.Client.AudienceCommon.prototype.name;

/**
 * @type {!API.Client.AudienceRule}
 * @export
 */
API.Client.AudienceCommon.prototype.rule;

