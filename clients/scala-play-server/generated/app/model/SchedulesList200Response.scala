package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for schedules_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class SchedulesList200Response(
  bookmark: Option[String],
  items: List[Schedule]
)

object SchedulesList200Response {
  implicit lazy val schedulesList200ResponseJsonFormat: Format[SchedulesList200Response] = Json.format[SchedulesList200Response]
}

