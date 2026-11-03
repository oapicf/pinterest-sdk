package model

import play.api.libs.json._

/**
  * Level of the reporting request
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class MetricsReportingLevel(
)

object MetricsReportingLevel {
  implicit lazy val metricsReportingLevelJsonFormat: Format[MetricsReportingLevel] = Json.format[MetricsReportingLevel]
}

