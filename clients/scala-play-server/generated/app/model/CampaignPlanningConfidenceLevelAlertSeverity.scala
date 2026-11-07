package model

import play.api.libs.json._

/**
  * Severity of a confidence level alert on delivery estimates.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CampaignPlanningConfidenceLevelAlertSeverity(
)

object CampaignPlanningConfidenceLevelAlertSeverity {
  implicit lazy val campaignPlanningConfidenceLevelAlertSeverityJsonFormat: Format[CampaignPlanningConfidenceLevelAlertSeverity] = Json.format[CampaignPlanningConfidenceLevelAlertSeverity]
}

