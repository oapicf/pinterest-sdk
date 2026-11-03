package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ScheduleBatchUpdate.
  * @param endTimestamp Schedule end time. Unix timestamp in seconds.
  * @param entityId entity ID.
  * @param entityType Specify the entity_type to get summary information
  * @param name Schedule name.
  * @param scheduleAction The schedule action.
  * @param scheduleId Schedule ID.
  * @param scheduleStatus Schedule status.
  * @param scheduleType The schedule type.
  * @param startTimestamp Schedule start time. Unix timestamp in seconds.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ScheduleBatchUpdate(
  deltaValue: Option[ScheduleDeltaValue],
  endTimestamp: Option[Int],
  entityId: Option[String],
  entityType: Option[AdAccountEntityType],
  id: String,
  name: Option[String],
  scheduleAction: Option[ScheduleAction],
  scheduleId: String,
  scheduleStatus: Option[ScheduleStatus],
  scheduleType: Option[ScheduleType],
  startTimestamp: Option[Int]
)

object ScheduleBatchUpdate {
  implicit lazy val scheduleBatchUpdateJsonFormat: Format[ScheduleBatchUpdate] = Json.format[ScheduleBatchUpdate]
}

