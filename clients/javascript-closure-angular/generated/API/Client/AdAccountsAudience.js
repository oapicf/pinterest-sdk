goog.provide('API.Client.AdAccountsAudience');

/**
 * @record
 */
API.Client.AdAccountsAudience = function() {}

/**
 * Ad account ID.
 * @type {!string}
 * @export
 */
API.Client.AdAccountsAudience.prototype.adAccountId;

/**
 * [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
 * @type {!API.Client.AudienceType}
 * @export
 */
API.Client.AdAccountsAudience.prototype.audienceType;

/**
 * The company that created this audience.
 * @type {!string}
 * @export
 */
API.Client.AdAccountsAudience.prototype.createdByCompanyName;

/**
 * Creation time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.AdAccountsAudience.prototype.createdTimestamp;

/**
 * Audience description.
 * @type {!string}
 * @export
 */
API.Client.AdAccountsAudience.prototype.description;

/**
 * Audience ID.
 * @type {!string}
 * @export
 */
API.Client.AdAccountsAudience.prototype.id;

/**
 * Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only.
 * @type {!boolean}
 * @export
 */
API.Client.AdAccountsAudience.prototype.isNca;

/**
 * Audience name.
 * @type {!string}
 * @export
 */
API.Client.AdAccountsAudience.prototype.name;

/**
 * @type {!API.Client.AdAccountsAudienceRule}
 * @export
 */
API.Client.AdAccountsAudience.prototype.rule;

/**
 * Audience size.
 * @type {!number}
 * @export
 */
API.Client.AdAccountsAudience.prototype.size;

/**
 * Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
 * @type {!API.Client.AudienceStatus}
 * @export
 */
API.Client.AdAccountsAudience.prototype.status;

/**
 * Always \"audience\".
 * @type {!string}
 * @export
 */
API.Client.AdAccountsAudience.prototype.type;

/**
 * Last update time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.AdAccountsAudience.prototype.updatedTimestamp;

