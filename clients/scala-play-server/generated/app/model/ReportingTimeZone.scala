package model

import play.api.libs.json._

/**
  * Specify the timezone to be applied for the reporting.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ReportingTimeZone(
)

object ReportingTimeZone {
  implicit lazy val reportingTimeZoneJsonFormat: Format[ReportingTimeZone] = Json.format[ReportingTimeZone]
}

