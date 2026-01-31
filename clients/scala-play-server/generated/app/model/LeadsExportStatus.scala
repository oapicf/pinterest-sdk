package model

import play.api.libs.json._

/**
  * Status of a leads export job
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class LeadsExportStatus(
)

object LeadsExportStatus {
  implicit lazy val leadsExportStatusJsonFormat: Format[LeadsExportStatus] = Json.format[LeadsExportStatus]
}

