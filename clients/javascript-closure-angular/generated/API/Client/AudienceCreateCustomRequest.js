goog.provide('API.Client.AudienceCreateCustomRequest');

/**
 * @record
 */
API.Client.AudienceCreateCustomRequest = function() {}

/**
 * Ad account ID.
 * @type {!string}
 * @export
 */
API.Client.AudienceCreateCustomRequest.prototype.adAccountId;

/**
 * Audience name.
 * @type {!string}
 * @export
 */
API.Client.AudienceCreateCustomRequest.prototype.name;

/**
 * @type {!API.Client.AudienceRule}
 * @export
 */
API.Client.AudienceCreateCustomRequest.prototype.rule;

/**
 * @type {!API.Client.AudienceSharingType}
 * @export
 */
API.Client.AudienceCreateCustomRequest.prototype.sharingType;

/**
 * @type {!API.Client.AudienceDataParty}
 * @export
 */
API.Client.AudienceCreateCustomRequest.prototype.dataParty;

/**
 * @type {!string}
 * @export
 */
API.Client.AudienceCreateCustomRequest.prototype.category;

