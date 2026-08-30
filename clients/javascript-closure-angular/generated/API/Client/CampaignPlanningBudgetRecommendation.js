goog.provide('API.Client.CampaignPlanningBudgetRecommendation');

/**
 * Budget recommendation response containing recommended budget, estimated days, and point estimations.
 * @record
 */
API.Client.CampaignPlanningBudgetRecommendation = function() {}

/**
 * The recommended budget amount.
 * @type {!number}
 * @export
 */
API.Client.CampaignPlanningBudgetRecommendation.prototype.budgetRecommendation;

/**
 * List of experimental budget recommendations.
 * @type {!Array<!API.Client.CampaignPlanningExperimentBudgetRecommendation>}
 * @export
 */
API.Client.CampaignPlanningBudgetRecommendation.prototype.experimentCampaignBudgetRecommendation;

/**
 * Recommended number of days for the campaign lifetime.
 * @type {!number}
 * @export
 */
API.Client.CampaignPlanningBudgetRecommendation.prototype.lifetimeDaysRecommendation;

/**
 * List of point estimations for different budget scenarios.
 * @type {!Array<!API.Client.CampaignPlanningBudgetRecommendationPoint>}
 * @export
 */
API.Client.CampaignPlanningBudgetRecommendation.prototype.pointEstimations;

