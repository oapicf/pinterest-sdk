goog.provide('API.Client.CampaignPlanningExperimentBudgetRecommendation');

/**
 * Experimental budget recommendation for a single experiment version.
 * @record
 */
API.Client.CampaignPlanningExperimentBudgetRecommendation = function() {}

/**
 * Recommended budget for this experiment version.
 * @type {!number}
 * @export
 */
API.Client.CampaignPlanningExperimentBudgetRecommendation.prototype.budgetRecommendation;

/**
 * Recommended lifetime days for this experiment.
 * @type {!number}
 * @export
 */
API.Client.CampaignPlanningExperimentBudgetRecommendation.prototype.lifetimeDaysRecommendation;

/**
 * Point estimations for this experiment version.
 * @type {!Array<!API.Client.CampaignPlanningBudgetRecommendationPoint>}
 * @export
 */
API.Client.CampaignPlanningExperimentBudgetRecommendation.prototype.pointEstimations;

/**
 * Version identifier for the experiment.
 * @type {!string}
 * @export
 */
API.Client.CampaignPlanningExperimentBudgetRecommendation.prototype.versionId;

