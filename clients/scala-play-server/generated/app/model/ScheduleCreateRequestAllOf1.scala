package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ScheduleCreateRequestAllOf1.
  * @param entityType Entity type
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ScheduleCreateRequestAllOf1(
  entityId: String,
  entityType: String
)

object ScheduleCreateRequestAllOf1 {
  implicit lazy val scheduleCreateRequestAllOf1JsonFormat: Format[ScheduleCreateRequestAllOf1] = Json.format[ScheduleCreateRequestAllOf1]
}

