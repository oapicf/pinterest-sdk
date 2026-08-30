goog.provide('API.Client.ScheduleCreateRequest');

/**
 * @record
 */
API.Client.ScheduleCreateRequest = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ScheduleCreateRequest.prototype.entityId;

/**
 * Entity type
 * @type {!string}
 * @export
 */
API.Client.ScheduleCreateRequest.prototype.entityType;

/**
 * @type {!API.Client.ScheduleCommonDeltaValue}
 * @export
 */
API.Client.ScheduleCreateRequest.prototype.deltaValue;

/**
 * Schedule end time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.ScheduleCreateRequest.prototype.endTimestamp;

/**
 * @type {!string}
 * @export
 */
API.Client.ScheduleCreateRequest.prototype.name;

/**
 * @type {!API.Client.ScheduleAction}
 * @export
 */
API.Client.ScheduleCreateRequest.prototype.scheduleAction;

/**
 * @type {!API.Client.ScheduleStatus}
 * @export
 */
API.Client.ScheduleCreateRequest.prototype.scheduleStatus;

/**
 * @type {!API.Client.ScheduleType}
 * @export
 */
API.Client.ScheduleCreateRequest.prototype.scheduleType;

/**
 * Schedule start time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.ScheduleCreateRequest.prototype.startTimestamp;

