package model

import play.api.libs.json._

/**
  * Error encountered while estimating delivery for a campaign.
  * @param message Human-readable error message.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CampaignPlanningResponseError(
  code: Option[CampaignPlanningResponseErrorCode],
  message: Option[String]
)

object CampaignPlanningResponseError {
  implicit lazy val campaignPlanningResponseErrorJsonFormat: Format[CampaignPlanningResponseError] = Json.format[CampaignPlanningResponseError]
}

