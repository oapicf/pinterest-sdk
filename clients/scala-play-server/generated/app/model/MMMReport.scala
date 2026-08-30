package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MMMReport.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class MMMReport(
  message: Option[String],
  reportStatus: Option[BulkReportingJobStatus],
  size: Option[BigDecimal],
  status: Option[String],
  token: Option[String],
  url: Option[String]
)

object MMMReport {
  implicit lazy val mMMReportJsonFormat: Format[MMMReport] = Json.format[MMMReport]
}

