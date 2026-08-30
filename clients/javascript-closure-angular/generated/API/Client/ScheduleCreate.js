goog.provide('API.Client.ScheduleCreate');

/**
 * Resource create operation model.
 * @record
 */
API.Client.ScheduleCreate = function() {}

/**
 * @type {!API.Client.Schedule_delta_value}
 * @export
 */
API.Client.ScheduleCreate.prototype.deltaValue;

/**
 * Schedule end time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.ScheduleCreate.prototype.endTimestamp;

/**
 * entity ID.
 * @type {!string}
 * @export
 */
API.Client.ScheduleCreate.prototype.entityId;

/**
 * Specify the entity_type to get summary information
 * @type {!API.Client.AdAccountEntityType}
 * @export
 */
API.Client.ScheduleCreate.prototype.entityType;

/**
 * Schedule name.
 * @type {!string}
 * @export
 */
API.Client.ScheduleCreate.prototype.name;

/**
 * The schedule action.
 * @type {!API.Client.ScheduleAction}
 * @export
 */
API.Client.ScheduleCreate.prototype.scheduleAction;

/**
 * Schedule status.
 * @type {!API.Client.ScheduleStatus}
 * @export
 */
API.Client.ScheduleCreate.prototype.scheduleStatus;

/**
 * The schedule type.
 * @type {!API.Client.ScheduleType}
 * @export
 */
API.Client.ScheduleCreate.prototype.scheduleType;

/**
 * Schedule start time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.ScheduleCreate.prototype.startTimestamp;

