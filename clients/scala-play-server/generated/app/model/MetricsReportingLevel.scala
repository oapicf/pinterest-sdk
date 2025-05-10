package model

import play.api.libs.json._

/**
  * Level of the reporting request
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class MetricsReportingLevel(
)

object MetricsReportingLevel {
  implicit lazy val metricsReportingLevelJsonFormat: Format[MetricsReportingLevel] = Json.format[MetricsReportingLevel]
}

