package model

import play.api.libs.json._

/**
  * Status of a leads export job
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class LeadsExportStatus(
)

object LeadsExportStatus {
  implicit lazy val leadsExportStatusJsonFormat: Format[LeadsExportStatus] = Json.format[LeadsExportStatus]
}

