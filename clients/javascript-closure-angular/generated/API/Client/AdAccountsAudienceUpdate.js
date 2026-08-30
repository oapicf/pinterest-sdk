goog.provide('API.Client.AdAccountsAudienceUpdate');

/**
 * Resource create or update operation model.
 * @record
 */
API.Client.AdAccountsAudienceUpdate = function() {}

/**
 * Ad account ID.
 * @type {!string}
 * @export
 */
API.Client.AdAccountsAudienceUpdate.prototype.adAccountId;

/**
 * [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
 * @type {!API.Client.AudienceType}
 * @export
 */
API.Client.AdAccountsAudienceUpdate.prototype.audienceType;

/**
 * Audience description.
 * @type {!string}
 * @export
 */
API.Client.AdAccountsAudienceUpdate.prototype.description;

/**
 * Audience name.
 * @type {!string}
 * @export
 */
API.Client.AdAccountsAudienceUpdate.prototype.name;

/**
 * Audience operation type (update or remove). Only valid in update request body.
 * @type {!API.Client.AudienceUpdateOperationType}
 * @export
 */
API.Client.AdAccountsAudienceUpdate.prototype.operationType;

/**
 * @type {!API.Client.AdAccountsAudienceRule}
 * @export
 */
API.Client.AdAccountsAudienceUpdate.prototype.rule;

