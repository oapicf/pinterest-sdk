package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LeadsExportResponseData.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class LeadsExportResponseData(
  exportStatus: Option[LeadsExportStatus],
  downloadUrl: Option[String]
)

object LeadsExportResponseData {
  implicit lazy val leadsExportResponseDataJsonFormat: Format[LeadsExportResponseData] = Json.format[LeadsExportResponseData]
}

