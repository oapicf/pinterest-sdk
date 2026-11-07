package model

import play.api.libs.json._

/**
  * A point estimation containing the estimate data and estimation type for a budget recommendation.
  * @param estimationType Estimation type for this point.
  * @param pointEstimate Point estimate data.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CampaignPlanningBudgetRecommendationPoint(
  estimationType: Option[CampaignPlanningEstimationType],
  pointEstimate: Option[CampaignPlanningPointEstimate]
)

object CampaignPlanningBudgetRecommendationPoint {
  implicit lazy val campaignPlanningBudgetRecommendationPointJsonFormat: Format[CampaignPlanningBudgetRecommendationPoint] = Json.format[CampaignPlanningBudgetRecommendationPoint]
}

