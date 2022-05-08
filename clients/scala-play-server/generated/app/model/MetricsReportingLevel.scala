package model

import play.api.libs.json._

/**
  * Level of the reporting request
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class MetricsReportingLevel(
)

object MetricsReportingLevel {
  implicit lazy val metricsReportingLevelJsonFormat: Format[MetricsReportingLevel] = Json.format[MetricsReportingLevel]
}

