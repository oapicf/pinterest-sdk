package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ConversionProductReport.
  * @param message Message returned from the create report request
  * @param reportStatus Async report status
  * @param size Size of the report in bytes
  * @param token Token returned from the create report request
  * @param url URL of the report
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ConversionProductReport(
  message: Option[String],
  reportStatus: Option[BulkReportingJobStatus],
  size: Option[BigDecimal],
  token: Option[String],
  url: Option[String]
)

object ConversionProductReport {
  implicit lazy val conversionProductReportJsonFormat: Format[ConversionProductReport] = Json.format[ConversionProductReport]
}

