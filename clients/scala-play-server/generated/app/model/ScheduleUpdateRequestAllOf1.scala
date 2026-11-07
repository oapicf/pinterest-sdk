package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ScheduleUpdateRequestAllOf1.
  * @param entityType Entity type
  * @param id Schedule ID.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ScheduleUpdateRequestAllOf1(
  entityId: Option[String],
  entityType: Option[String],
  id: String
)

object ScheduleUpdateRequestAllOf1 {
  implicit lazy val scheduleUpdateRequestAllOf1JsonFormat: Format[ScheduleUpdateRequestAllOf1] = Json.format[ScheduleUpdateRequestAllOf1]
}

