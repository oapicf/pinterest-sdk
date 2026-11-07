package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for schedules_create_200_response_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class SchedulesCreate200ResponseInner(
  data: SchedulesCreate200ResponseInnerData
)

object SchedulesCreate200ResponseInner {
  implicit lazy val schedulesCreate200ResponseInnerJsonFormat: Format[SchedulesCreate200ResponseInner] = Json.format[SchedulesCreate200ResponseInner]
}

