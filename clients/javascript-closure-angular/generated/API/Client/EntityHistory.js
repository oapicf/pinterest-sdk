goog.provide('API.Client.EntityHistory');

/**
 * @record
 */
API.Client.EntityHistory = function() {}

/**
 * A Unix timestamp representing the time of the change in seconds
 * @type {!number}
 * @export
 */
API.Client.EntityHistory.prototype.changeTimestamp;

/**
 * Properties associated with a particular change to an entity's data
 * @type {!Array<!API.Client.EntityDataChangeHistory>}
 * @export
 */
API.Client.EntityHistory.prototype.dataChanges;

/**
 * The id of the entity that was changed
 * @type {!string}
 * @export
 */
API.Client.EntityHistory.prototype.entityId;

/**
 * The name of the entity that was changed
 * @type {!string}
 * @export
 */
API.Client.EntityHistory.prototype.entityName;

/**
 * The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users
 * @type {!string}
 * @export
 */
API.Client.EntityHistory.prototype.ldap;

/**
 * The type of operation that caused the change
 * @type {!API.Client.ChangeHistoryOperationType}
 * @export
 */
API.Client.EntityHistory.prototype.operation;

/**
 * The id of the user who initiated the change
 * @type {!string}
 * @export
 */
API.Client.EntityHistory.prototype.userId;

