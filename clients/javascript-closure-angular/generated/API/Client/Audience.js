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
 * Audience ID.
 * @type {!string}
 * @export
 */
API.Client.Audience.prototype.id;

/**
 * Audience name.
 * @type {!string}
 * @export
 */
API.Client.Audience.prototype.name;

/**
 * <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
 * @type {!string}
 * @export
 */
API.Client.Audience.prototype.audienceType;

/**
 * Audience description.
 * @type {!string}
 * @export
 */
API.Client.Audience.prototype.description;

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
 * @type {!string}
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
 * Creation time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.Audience.prototype.createdTimestamp;

/**
 * Last update time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.Audience.prototype.updatedTimestamp;

