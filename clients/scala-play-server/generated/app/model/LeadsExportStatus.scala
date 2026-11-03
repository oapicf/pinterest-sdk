package model

import play.api.libs.json._

/**
  * Status of a leads export job
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class LeadsExportStatus(
)

object LeadsExportStatus {
  implicit lazy val leadsExportStatusJsonFormat: Format[LeadsExportStatus] = Json.format[LeadsExportStatus]
}

