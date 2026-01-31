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
 * <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR. Values are case-sensitive.
 * @type {!API.Client.AudienceType}
 * @export
 */
API.Client.AudienceCreateRequest.prototype.audienceType;

/**
 * Audience description.
 * @type {!string}
 * @export
 */
API.Client.AudienceCreateRequest.prototype.description;

