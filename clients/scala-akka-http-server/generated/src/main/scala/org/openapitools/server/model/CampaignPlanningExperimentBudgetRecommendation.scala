package org.openapitools.server.model


/**
 * Experimental budget recommendation for a single experiment version.
 *
 * @param budgetRecommendation Recommended budget for this experiment version. for example: ''5500000''
 * @param lifetimeDaysRecommendation Recommended lifetime days for this experiment. for example: ''35''
 * @param pointEstimations Point estimations for this experiment version. for example: ''null''
 * @param versionId Version identifier for the experiment. for example: ''null''
*/
final case class CampaignPlanningExperimentBudgetRecommendation (
  budgetRecommendation: Option[Int] = None,
  lifetimeDaysRecommendation: Option[Int] = None,
  pointEstimations: Option[Seq[CampaignPlanningBudgetRecommendationPoint]] = None,
  versionId: Option[String] = None
)

