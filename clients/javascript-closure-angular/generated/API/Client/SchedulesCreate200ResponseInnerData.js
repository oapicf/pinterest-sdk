goog.provide('API.Client.schedules_create_200_response_inner_data');

/**
 * Created/updated resource on success or error details on failure
 * @record
 */
API.Client.SchedulesCreate200ResponseInnerData = function() {}

/**
 * @type {!API.Client.Schedule_delta_value}
 * @export
 */
API.Client.SchedulesCreate200ResponseInnerData.prototype.deltaValue;

/**
 * Schedule end time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.SchedulesCreate200ResponseInnerData.prototype.endTimestamp;

/**
 * entity ID.
 * @type {!string}
 * @export
 */
API.Client.SchedulesCreate200ResponseInnerData.prototype.entityId;

/**
 * Specify the entity_type to get summary information
 * @type {!API.Client.AdAccountEntityType}
 * @export
 */
API.Client.SchedulesCreate200ResponseInnerData.prototype.entityType;

/**
 * Schedule name.
 * @type {!string}
 * @export
 */
API.Client.SchedulesCreate200ResponseInnerData.prototype.name;

/**
 * The schedule action.
 * @type {!API.Client.ScheduleAction}
 * @export
 */
API.Client.SchedulesCreate200ResponseInnerData.prototype.scheduleAction;

/**
 * Schedule ID.
 * @type {!string}
 * @export
 */
API.Client.SchedulesCreate200ResponseInnerData.prototype.scheduleId;

/**
 * Schedule status.
 * @type {!API.Client.ScheduleStatus}
 * @export
 */
API.Client.SchedulesCreate200ResponseInnerData.prototype.scheduleStatus;

/**
 * The schedule type.
 * @type {!API.Client.ScheduleType}
 * @export
 */
API.Client.SchedulesCreate200ResponseInnerData.prototype.scheduleType;

/**
 * Schedule start time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.SchedulesCreate200ResponseInnerData.prototype.startTimestamp;

/**
 * @type {!string}
 * @export
 */
API.Client.SchedulesCreate200ResponseInnerData.prototype.id;

/**
 * @type {!API.Client.Pinterest.Lib.Error}
 * @export
 */
API.Client.SchedulesCreate200ResponseInnerData.prototype.exceptions;

