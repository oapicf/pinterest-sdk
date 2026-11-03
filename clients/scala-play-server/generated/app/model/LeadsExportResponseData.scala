package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LeadsExportResponseData.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class LeadsExportResponseData(
  downloadUrl: Option[String],
  exportStatus: Option[LeadsExportStatus]
)

object LeadsExportResponseData {
  implicit lazy val leadsExportResponseDataJsonFormat: Format[LeadsExportResponseData] = Json.format[LeadsExportResponseData]
}

