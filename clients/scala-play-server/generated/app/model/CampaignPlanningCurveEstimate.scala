package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CampaignPlanningCurveEstimate.
  * @param estimationType Estimation type for campaign planning estimated curve
  * @param points The estimation points that make up the estimated curve.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CampaignPlanningCurveEstimate(
  estimationType: Option[CampaignPlanningEstimationType],
  points: Option[List[CampaignPlanningPointEstimate]]
)

object CampaignPlanningCurveEstimate {
  implicit lazy val campaignPlanningCurveEstimateJsonFormat: Format[CampaignPlanningCurveEstimate] = Json.format[CampaignPlanningCurveEstimate]
}

