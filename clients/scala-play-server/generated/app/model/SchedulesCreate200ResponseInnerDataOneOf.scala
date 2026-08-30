package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for schedules_create_200_response_inner_data_oneOf.
  * @param scheduleId Schedule ID.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class SchedulesCreate200ResponseInnerDataOneOf(
  id: String,
  scheduleId: String,
  exceptions: Error
)

object SchedulesCreate200ResponseInnerDataOneOf {
  implicit lazy val schedulesCreate200ResponseInnerDataOneOfJsonFormat: Format[SchedulesCreate200ResponseInnerDataOneOf] = Json.format[SchedulesCreate200ResponseInnerDataOneOf]
}

