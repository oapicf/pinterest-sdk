package model

import play.api.libs.json._

/**
  * Budget recommendation response containing recommended budget, estimated days, and point estimations.
  * @param budgetRecommendation The recommended budget amount.
  * @param experimentCampaignBudgetRecommendation List of experimental budget recommendations.
  * @param lifetimeDaysRecommendation Recommended number of days for the campaign lifetime.
  * @param pointEstimations List of point estimations for different budget scenarios.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CampaignPlanningBudgetRecommendation(
  budgetRecommendation: Option[Int],
  experimentCampaignBudgetRecommendation: Option[List[CampaignPlanningExperimentBudgetRecommendation]],
  lifetimeDaysRecommendation: Option[Int],
  pointEstimations: Option[List[CampaignPlanningBudgetRecommendationPoint]]
)

object CampaignPlanningBudgetRecommendation {
  implicit lazy val campaignPlanningBudgetRecommendationJsonFormat: Format[CampaignPlanningBudgetRecommendation] = Json.format[CampaignPlanningBudgetRecommendation]
}

