package model

import play.api.libs.json._

/**
  * Reason for a confidence level alert on delivery estimates.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CampaignPlanningConfidenceLevelAlertReason(
)

object CampaignPlanningConfidenceLevelAlertReason {
  implicit lazy val campaignPlanningConfidenceLevelAlertReasonJsonFormat: Format[CampaignPlanningConfidenceLevelAlertReason] = Json.format[CampaignPlanningConfidenceLevelAlertReason]
}

