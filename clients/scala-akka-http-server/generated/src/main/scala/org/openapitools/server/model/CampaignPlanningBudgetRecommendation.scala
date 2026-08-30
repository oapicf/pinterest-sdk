package org.openapitools.server.model


/**
 * Budget recommendation response containing recommended budget, estimated days, and point estimations.
 *
 * @param budgetRecommendation The recommended budget amount. for example: ''5000000''
 * @param experimentCampaignBudgetRecommendation List of experimental budget recommendations. for example: ''null''
 * @param lifetimeDaysRecommendation Recommended number of days for the campaign lifetime. for example: ''30''
 * @param pointEstimations List of point estimations for different budget scenarios. for example: ''null''
*/
final case class CampaignPlanningBudgetRecommendation (
  budgetRecommendation: Option[Int] = None,
  experimentCampaignBudgetRecommendation: Option[Seq[CampaignPlanningExperimentBudgetRecommendation]] = None,
  lifetimeDaysRecommendation: Option[Int] = None,
  pointEstimations: Option[Seq[CampaignPlanningBudgetRecommendationPoint]] = None
)

