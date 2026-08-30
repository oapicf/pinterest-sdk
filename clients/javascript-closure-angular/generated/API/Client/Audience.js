goog.provide('API.Client.Audience');

/**
 * @record
 */
API.Client.Audience = function() {}

/**
 * Ad account ID.
 * @type {!string}
 * @export
 */
API.Client.Audience.prototype.adAccountId;

/**
 * [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
 * @type {!API.Client.PinnerListType}
 * @export
 */
API.Client.Audience.prototype.audienceType;

/**
 * The company that created this audience.
 * @type {!string}
 * @export
 */
API.Client.Audience.prototype.createdByCompanyName;

/**
 * Creation time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.Audience.prototype.createdTimestamp;

/**
 * Audience description.
 * @type {!string}
 * @export
 */
API.Client.Audience.prototype.description;

/**
 * Audience ID.
 * @type {!string}
 * @export
 */
API.Client.Audience.prototype.id;

/**
 * Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only.
 * @type {!boolean}
 * @export
 */
API.Client.Audience.prototype.isNca;

/**
 * Audience name.
 * @type {!string}
 * @export
 */
API.Client.Audience.prototype.name;

/**
 * @type {!API.Client.AudienceRule}
 * @export
 */
API.Client.Audience.prototype.rule;

/**
 * Audience size.
 * @type {!number}
 * @export
 */
API.Client.Audience.prototype.size;

/**
 * Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
 * @type {!API.Client.AudienceStatus}
 * @export
 */
API.Client.Audience.prototype.status;

/**
 * Always \"audience\".
 * @type {!string}
 * @export
 */
API.Client.Audience.prototype.type;

/**
 * Last update time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.Audience.prototype.updatedTimestamp;

