goog.provide('API.Client.ScheduleUpdateRequest');

/**
 * @record
 */
API.Client.ScheduleUpdateRequest = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ScheduleUpdateRequest.prototype.entityId;

/**
 * Entity type
 * @type {!string}
 * @export
 */
API.Client.ScheduleUpdateRequest.prototype.entityType;

/**
 * Schedule ID.
 * @type {!string}
 * @export
 */
API.Client.ScheduleUpdateRequest.prototype.id;

/**
 * @type {!API.Client.ScheduleCommonDeltaValue}
 * @export
 */
API.Client.ScheduleUpdateRequest.prototype.deltaValue;

/**
 * Schedule end time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.ScheduleUpdateRequest.prototype.endTimestamp;

/**
 * @type {!string}
 * @export
 */
API.Client.ScheduleUpdateRequest.prototype.name;

/**
 * @type {!API.Client.ScheduleAction}
 * @export
 */
API.Client.ScheduleUpdateRequest.prototype.scheduleAction;

/**
 * @type {!API.Client.ScheduleStatus}
 * @export
 */
API.Client.ScheduleUpdateRequest.prototype.scheduleStatus;

/**
 * @type {!API.Client.ScheduleType}
 * @export
 */
API.Client.ScheduleUpdateRequest.prototype.scheduleType;

/**
 * Schedule start time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.ScheduleUpdateRequest.prototype.startTimestamp;

