package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LeadsExportCreateResponse.
  * @param leadsExportId ID for the leads export job
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class LeadsExportCreateResponse(
  leadsExportId: Option[String]
)

object LeadsExportCreateResponse {
  implicit lazy val leadsExportCreateResponseJsonFormat: Format[LeadsExportCreateResponse] = Json.format[LeadsExportCreateResponse]
}

