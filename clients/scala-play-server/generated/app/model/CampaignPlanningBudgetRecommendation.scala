package model

import play.api.libs.json._

/**
  * Budget recommendation response containing recommended budget, estimated days, and point estimations.
  * @param budgetRecommendation The recommended budget amount.
  * @param experimentCampaignBudgetRecommendation List of experimental budget recommendations.
  * @param lifetimeDaysRecommendation Recommended number of days for the campaign lifetime.
  * @param pointEstimations List of point estimations for different budget scenarios.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CampaignPlanningBudgetRecommendation(
  budgetRecommendation: Option[Int],
  experimentCampaignBudgetRecommendation: Option[List[CampaignPlanningExperimentBudgetRecommendation]],
  lifetimeDaysRecommendation: Option[Int],
  pointEstimations: Option[List[CampaignPlanningBudgetRecommendationPoint]]
)

object CampaignPlanningBudgetRecommendation {
  implicit lazy val campaignPlanningBudgetRecommendationJsonFormat: Format[CampaignPlanningBudgetRecommendation] = Json.format[CampaignPlanningBudgetRecommendation]
}

