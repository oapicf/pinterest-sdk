goog.provide('API.Client.AudienceCreateRequest');

/**
 * @record
 */
API.Client.AudienceCreateRequest = function() {}

/**
 * Ad account ID.
 * @type {!string}
 * @export
 */
API.Client.AudienceCreateRequest.prototype.adAccountId;

/**
 * Audience name.
 * @type {!string}
 * @export
 */
API.Client.AudienceCreateRequest.prototype.name;

/**
 * @type {!API.Client.AudienceRule}
 * @export
 */
API.Client.AudienceCreateRequest.prototype.rule;

/**
 * Audience description.
 * @type {!string}
 * @export
 */
API.Client.AudienceCreateRequest.prototype.description;

/**
 * @type {!API.Client.AudienceCreateRequest_1_audience_type}
 * @export
 */
API.Client.AudienceCreateRequest.prototype.audienceType;

