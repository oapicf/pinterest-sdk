goog.provide('API.Client.ScheduleBatchUpdate');

/**
 * @record
 */
API.Client.ScheduleBatchUpdate = function() {}

/**
 * @type {!API.Client.Schedule_delta_value}
 * @export
 */
API.Client.ScheduleBatchUpdate.prototype.deltaValue;

/**
 * Schedule end time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.ScheduleBatchUpdate.prototype.endTimestamp;

/**
 * entity ID.
 * @type {!string}
 * @export
 */
API.Client.ScheduleBatchUpdate.prototype.entityId;

/**
 * Specify the entity_type to get summary information
 * @type {!API.Client.AdAccountEntityType}
 * @export
 */
API.Client.ScheduleBatchUpdate.prototype.entityType;

/**
 * @type {!string}
 * @export
 */
API.Client.ScheduleBatchUpdate.prototype.id;

/**
 * Schedule name.
 * @type {!string}
 * @export
 */
API.Client.ScheduleBatchUpdate.prototype.name;

/**
 * The schedule action.
 * @type {!API.Client.ScheduleAction}
 * @export
 */
API.Client.ScheduleBatchUpdate.prototype.scheduleAction;

/**
 * Schedule ID.
 * @type {!string}
 * @export
 */
API.Client.ScheduleBatchUpdate.prototype.scheduleId;

/**
 * Schedule status.
 * @type {!API.Client.ScheduleStatus}
 * @export
 */
API.Client.ScheduleBatchUpdate.prototype.scheduleStatus;

/**
 * The schedule type.
 * @type {!API.Client.ScheduleType}
 * @export
 */
API.Client.ScheduleBatchUpdate.prototype.scheduleType;

/**
 * Schedule start time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.ScheduleBatchUpdate.prototype.startTimestamp;

