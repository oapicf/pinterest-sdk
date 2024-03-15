package model

import play.api.libs.json._

/**
  * Level of the reporting request
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class MetricsReportingLevel(
)

object MetricsReportingLevel {
  implicit lazy val metricsReportingLevelJsonFormat: Format[MetricsReportingLevel] = Json.format[MetricsReportingLevel]
}

