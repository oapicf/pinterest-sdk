package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LeadsExportCreateRequest.
  * @param startDate Export leads collected on and after start date (UTC). Format: YYYY-MM-DD
  * @param endDate Export leads collected on and before end date (UTC). Format: YYYY-MM-DD
  * @param adId ID for the ad collecting leads
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class LeadsExportCreateRequest(
  startDate: String,
  endDate: String,
  adId: String
)

object LeadsExportCreateRequest {
  implicit lazy val leadsExportCreateRequestJsonFormat: Format[LeadsExportCreateRequest] = Json.format[LeadsExportCreateRequest]
}

