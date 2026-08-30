package model

import play.api.libs.json._

/**
  * A confidence level alert for the delivery estimates provided in the response.
  * @param description Human-readable context for debugging. Not intended for display to end users.
  * @param reason Reason for the confidence level alert.
  * @param severity Severity of the confidence level alert.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CampaignPlanningConfidenceLevelAlert(
  description: Option[String],
  reason: Option[CampaignPlanningConfidenceLevelAlertReason],
  severity: Option[CampaignPlanningConfidenceLevelAlertSeverity]
)

object CampaignPlanningConfidenceLevelAlert {
  implicit lazy val campaignPlanningConfidenceLevelAlertJsonFormat: Format[CampaignPlanningConfidenceLevelAlert] = Json.format[CampaignPlanningConfidenceLevelAlert]
}

