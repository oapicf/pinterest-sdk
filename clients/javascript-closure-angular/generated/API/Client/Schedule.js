goog.provide('API.Client.Schedule');

/**
 * @record
 */
API.Client.Schedule = function() {}

/**
 * @type {!API.Client.Schedule_delta_value}
 * @export
 */
API.Client.Schedule.prototype.deltaValue;

/**
 * Schedule end time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.Schedule.prototype.endTimestamp;

/**
 * entity ID.
 * @type {!string}
 * @export
 */
API.Client.Schedule.prototype.entityId;

/**
 * Specify the entity_type to get summary information
 * @type {!API.Client.AdAccountEntityType}
 * @export
 */
API.Client.Schedule.prototype.entityType;

/**
 * Schedule name.
 * @type {!string}
 * @export
 */
API.Client.Schedule.prototype.name;

/**
 * The schedule action.
 * @type {!API.Client.ScheduleAction}
 * @export
 */
API.Client.Schedule.prototype.scheduleAction;

/**
 * Schedule ID.
 * @type {!string}
 * @export
 */
API.Client.Schedule.prototype.scheduleId;

/**
 * Schedule status.
 * @type {!API.Client.ScheduleStatus}
 * @export
 */
API.Client.Schedule.prototype.scheduleStatus;

/**
 * The schedule type.
 * @type {!API.Client.ScheduleType}
 * @export
 */
API.Client.Schedule.prototype.scheduleType;

/**
 * Schedule start time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.Schedule.prototype.startTimestamp;

