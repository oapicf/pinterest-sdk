package model

import play.api.libs.json._

/**
  * Created/updated resource on success or error details on failure
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
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class SchedulesCreate200ResponseInnerData(
  deltaValue: Option[ScheduleDeltaValue],
  endTimestamp: Option[Int],
  entityId: String,
  entityType: Option[AdAccountEntityType],
  name: Option[String],
  scheduleAction: Option[ScheduleAction],
  scheduleId: String,
  scheduleStatus: Option[ScheduleStatus],
  scheduleType: Option[ScheduleType],
  startTimestamp: Option[Int],
  id: String,
  exceptions: Error
)

object SchedulesCreate200ResponseInnerData {
  implicit lazy val schedulesCreate200ResponseInnerDataJsonFormat: Format[SchedulesCreate200ResponseInnerData] = Json.format[SchedulesCreate200ResponseInnerData]
}

