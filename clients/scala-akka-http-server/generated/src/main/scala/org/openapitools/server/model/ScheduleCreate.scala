package org.openapitools.server.model


/**
 * Resource create operation model.
 *
 * @param deltaValue  for example: ''null''
 * @param endTimestamp Schedule end time. Unix timestamp in seconds. for example: ''null''
 * @param entityId entity ID. for example: ''null''
 * @param entityType Specify the entity_type to get summary information for example: ''null''
 * @param name Schedule name. for example: ''null''
 * @param scheduleAction The schedule action. for example: ''null''
 * @param scheduleStatus Schedule status. for example: ''null''
 * @param scheduleType The schedule type. for example: ''null''
 * @param startTimestamp Schedule start time. Unix timestamp in seconds. for example: ''null''
*/
final case class ScheduleCreate (
  deltaValue: Option[ScheduleDeltaValue] = None,
  endTimestamp: Option[Int] = None,
  entityId: String,
  entityType: Option[AdAccountEntityType] = None,
  name: Option[String] = None,
  scheduleAction: Option[ScheduleAction] = None,
  scheduleStatus: Option[ScheduleStatus] = None,
  scheduleType: Option[ScheduleType] = None,
  startTimestamp: Option[Int] = None
)

