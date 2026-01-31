package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LeadsExportCreateRequest.
  * @param startDate Export leads collected on and after start date (UTC). Format: YYYY-MM-DD
  * @param endDate Export leads collected on and before end date (UTC). Format: YYYY-MM-DD
  * @param adId ID for the ad collecting leads
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class LeadsExportCreateRequest(
  startDate: String,
  endDate: String,
  adId: String
)

object LeadsExportCreateRequest {
  implicit lazy val leadsExportCreateRequestJsonFormat: Format[LeadsExportCreateRequest] = Json.format[LeadsExportCreateRequest]
}

