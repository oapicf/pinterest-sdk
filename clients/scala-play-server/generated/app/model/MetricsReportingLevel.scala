package model

import play.api.libs.json._

/**
  * Level of the reporting request
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class MetricsReportingLevel(
)

object MetricsReportingLevel {
  implicit lazy val metricsReportingLevelJsonFormat: Format[MetricsReportingLevel] = Json.format[MetricsReportingLevel]
}

