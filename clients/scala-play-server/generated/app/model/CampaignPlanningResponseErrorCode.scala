package model

import play.api.libs.json._

/**
  * Error code returned for a campaign planning estimate failure.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CampaignPlanningResponseErrorCode(
)

object CampaignPlanningResponseErrorCode {
  implicit lazy val campaignPlanningResponseErrorCodeJsonFormat: Format[CampaignPlanningResponseErrorCode] = Json.format[CampaignPlanningResponseErrorCode]
}

