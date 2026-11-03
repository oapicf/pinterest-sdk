package model

import play.api.libs.json._

/**
  * Specify the timezone to be applied for the reporting.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ReportingTimeZone(
)

object ReportingTimeZone {
  implicit lazy val reportingTimeZoneJsonFormat: Format[ReportingTimeZone] = Json.format[ReportingTimeZone]
}

