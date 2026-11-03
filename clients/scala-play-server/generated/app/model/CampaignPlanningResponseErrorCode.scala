package model

import play.api.libs.json._

/**
  * Error code returned for a campaign planning estimate failure.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CampaignPlanningResponseErrorCode(
)

object CampaignPlanningResponseErrorCode {
  implicit lazy val campaignPlanningResponseErrorCodeJsonFormat: Format[CampaignPlanningResponseErrorCode] = Json.format[CampaignPlanningResponseErrorCode]
}

