goog.provide('API.Client.AdAccountsAudienceCreate');

/**
 * Resource create operation model.
 * @record
 */
API.Client.AdAccountsAudienceCreate = function() {}

/**
 * Ad account ID.
 * @type {!string}
 * @export
 */
API.Client.AdAccountsAudienceCreate.prototype.adAccountId;

/**
 * [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
 * @type {!API.Client.AudienceType}
 * @export
 */
API.Client.AdAccountsAudienceCreate.prototype.audienceType;

/**
 * Audience description.
 * @type {!string}
 * @export
 */
API.Client.AdAccountsAudienceCreate.prototype.description;

/**
 * Audience name.
 * @type {!string}
 * @export
 */
API.Client.AdAccountsAudienceCreate.prototype.name;

/**
 * @type {!API.Client.AdAccountsAudienceRule}
 * @export
 */
API.Client.AdAccountsAudienceCreate.prototype.rule;

