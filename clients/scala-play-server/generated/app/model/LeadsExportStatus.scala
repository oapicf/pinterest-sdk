package model

import play.api.libs.json._

/**
  * Status of a leads export job
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class LeadsExportStatus(
)

object LeadsExportStatus {
  implicit lazy val leadsExportStatusJsonFormat: Format[LeadsExportStatus] = Json.format[LeadsExportStatus]
}

