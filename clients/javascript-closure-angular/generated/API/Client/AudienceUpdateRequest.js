goog.provide('API.Client.AudienceUpdateRequest');

/**
 * @record
 */
API.Client.AudienceUpdateRequest = function() {}

/**
 * Ad account ID.
 * @type {!string}
 * @export
 */
API.Client.AudienceUpdateRequest.prototype.adAccountId;

/**
 * Audience name.
 * @type {!string}
 * @export
 */
API.Client.AudienceUpdateRequest.prototype.name;

/**
 * @type {!API.Client.AudienceRule}
 * @export
 */
API.Client.AudienceUpdateRequest.prototype.rule;

/**
 * Audience description.
 * @type {!string}
 * @export
 */
API.Client.AudienceUpdateRequest.prototype.description;

/**
 * @type {!API.Client.AudienceUpdateOperationType}
 * @export
 */
API.Client.AudienceUpdateRequest.prototype.operationType;

