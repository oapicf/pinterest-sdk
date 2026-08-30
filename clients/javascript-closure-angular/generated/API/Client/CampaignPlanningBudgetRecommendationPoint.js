goog.provide('API.Client.CampaignPlanningBudgetRecommendationPoint');

/**
 * A point estimation containing the estimate data and estimation type for a budget recommendation.
 * @record
 */
API.Client.CampaignPlanningBudgetRecommendationPoint = function() {}

/**
 * Estimation type for this point.
 * @type {!API.Client.CampaignPlanningEstimationType}
 * @export
 */
API.Client.CampaignPlanningBudgetRecommendationPoint.prototype.estimationType;

/**
 * Point estimate data.
 * @type {!API.Client.CampaignPlanningPointEstimate}
 * @export
 */
API.Client.CampaignPlanningBudgetRecommendationPoint.prototype.pointEstimate;

