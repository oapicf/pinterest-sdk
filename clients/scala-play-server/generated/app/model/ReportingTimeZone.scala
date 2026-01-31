package model

import play.api.libs.json._

/**
  * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/) Specify the timezone to be applied for the reporting.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ReportingTimeZone(
)

object ReportingTimeZone {
  implicit lazy val reportingTimeZoneJsonFormat: Format[ReportingTimeZone] = Json.format[ReportingTimeZone]
}

