package org.openapitools.server.model


/**
 * A point estimation containing the estimate data and estimation type for a budget recommendation.
 *
 * @param estimationType Estimation type for this point. for example: ''null''
 * @param pointEstimate Point estimate data. for example: ''null''
*/
final case class CampaignPlanningBudgetRecommendationPoint (
  estimationType: Option[CampaignPlanningEstimationType] = None,
  pointEstimate: Option[CampaignPlanningPointEstimate] = None
)

