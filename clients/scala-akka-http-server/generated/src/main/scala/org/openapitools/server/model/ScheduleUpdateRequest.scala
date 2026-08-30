package org.openapitools.server.model


/**
 * @param entityId  for example: ''null''
 * @param entityType Entity type for example: ''null''
 * @param id Schedule ID. for example: ''null''
 * @param deltaValue  for example: ''null''
 * @param endTimestamp Schedule end time. Unix timestamp in seconds. for example: ''null''
 * @param name  for example: ''null''
 * @param scheduleAction  for example: ''null''
 * @param scheduleStatus  for example: ''null''
 * @param scheduleType  for example: ''null''
 * @param startTimestamp Schedule start time. Unix timestamp in seconds. for example: ''null''
*/
final case class ScheduleUpdateRequest (
  entityId: Option[String] = None,
  entityType: Option[String] = None,
  id: String,
  deltaValue: Option[ScheduleCommonDeltaValue] = None,
  endTimestamp: Option[Int] = None,
  name: Option[String] = None,
  scheduleAction: Option[ScheduleAction] = None,
  scheduleStatus: Option[ScheduleStatus] = None,
  scheduleType: Option[ScheduleType] = None,
  startTimestamp: Option[Int] = None
)

