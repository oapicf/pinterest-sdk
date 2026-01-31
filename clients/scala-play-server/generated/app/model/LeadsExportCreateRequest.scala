package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LeadsExportCreateRequest.
  * @param adId ID for the ad collecting leads
  * @param endDate Export leads collected on and before end date (UTC). Format: YYYY-MM-DD
  * @param startDate Export leads collected on and after start date (UTC). Format: YYYY-MM-DD
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class LeadsExportCreateRequest(
  adId: String,
  endDate: String,
  startDate: String
)

object LeadsExportCreateRequest {
  implicit lazy val leadsExportCreateRequestJsonFormat: Format[LeadsExportCreateRequest] = Json.format[LeadsExportCreateRequest]
}

