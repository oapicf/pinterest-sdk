package org.openapitools.server.model


/**
 * @param entityId  for example: ''null''
 * @param entityType Entity type for example: ''null''
 * @param deltaValue  for example: ''null''
 * @param endTimestamp Schedule end time. Unix timestamp in seconds. for example: ''null''
 * @param name  for example: ''null''
 * @param scheduleAction  for example: ''null''
 * @param scheduleStatus  for example: ''null''
 * @param scheduleType  for example: ''null''
 * @param startTimestamp Schedule start time. Unix timestamp in seconds. for example: ''null''
*/
final case class ScheduleCreateRequest (
  entityId: String,
  entityType: String,
  deltaValue: ScheduleCommonDeltaValue,
  endTimestamp: Int,
  name: String,
  scheduleAction: ScheduleAction,
  scheduleStatus: ScheduleStatus,
  scheduleType: ScheduleType,
  startTimestamp: Int
)

