goog.provide('API.Client.CampaignPlanningCurveEstimate');

/**
 * @record
 */
API.Client.CampaignPlanningCurveEstimate = function() {}

/**
 * Estimation type for campaign planning estimated curve
 * @type {!API.Client.CampaignPlanningEstimationType}
 * @export
 */
API.Client.CampaignPlanningCurveEstimate.prototype.estimationType;

/**
 * The estimation points that make up the estimated curve.
 * @type {!Array<!API.Client.CampaignPlanningPointEstimate>}
 * @export
 */
API.Client.CampaignPlanningCurveEstimate.prototype.points;

