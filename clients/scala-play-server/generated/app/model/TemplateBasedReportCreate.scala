package model

import play.api.libs.json._

/**
  * Resource create operation model.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TemplateBasedReportCreate(
  message: Option[String],
  reportStatus: BulkReportingJobStatus,
  token: Option[String]
)

object TemplateBasedReportCreate {
  implicit lazy val templateBasedReportCreateJsonFormat: Format[TemplateBasedReportCreate] = Json.format[TemplateBasedReportCreate]
}

