package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TemplateBasedReport.
  * @param templateId Unique identifier of a template.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TemplateBasedReport(
  message: Option[String],
  reportStatus: BulkReportingJobStatus,
  templateId: String,
  token: Option[String]
)

object TemplateBasedReport {
  implicit lazy val templateBasedReportJsonFormat: Format[TemplateBasedReport] = Json.format[TemplateBasedReport]
}

