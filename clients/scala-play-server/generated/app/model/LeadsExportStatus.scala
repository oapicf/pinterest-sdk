package model

import play.api.libs.json._

/**
  * Status of a leads export job
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class LeadsExportStatus(
)

object LeadsExportStatus {
  implicit lazy val leadsExportStatusJsonFormat: Format[LeadsExportStatus] = Json.format[LeadsExportStatus]
}

