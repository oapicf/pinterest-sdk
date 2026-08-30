package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param adId ID for the ad collecting leads.
  * @param endDate Export leads collected on and before end date (UTC). Format: YYYY-MM-DD.
  * @param startDate Export leads collected on and after start date (UTC). Format: YYYY-MM-DD.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class LeadsExportsCreate(
  adId: String,
  endDate: String,
  startDate: String
)

object LeadsExportsCreate {
  implicit lazy val leadsExportsCreateJsonFormat: Format[LeadsExportsCreate] = Json.format[LeadsExportsCreate]
}

