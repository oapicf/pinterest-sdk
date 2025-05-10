package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LeadsExportCreateResponse.
  * @param leadsExportId ID for the leads export job
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class LeadsExportCreateResponse(
  leadsExportId: Option[String]
)

object LeadsExportCreateResponse {
  implicit lazy val leadsExportCreateResponseJsonFormat: Format[LeadsExportCreateResponse] = Json.format[LeadsExportCreateResponse]
}

