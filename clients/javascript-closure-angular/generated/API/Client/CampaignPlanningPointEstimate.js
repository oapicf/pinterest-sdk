goog.provide('API.Client.CampaignPlanningPointEstimate');

/**
 * A JSON object that represents a single estimation point. An estimation point contains the expected budget used and the estimated result, Y, along with an expected range based for the budget.
 * @record
 */
API.Client.CampaignPlanningPointEstimate = function() {}

/**
 * The budget value of the point.
 * @type {!number}
 * @export
 */
API.Client.CampaignPlanningPointEstimate.prototype.budget;

/**
 * Y value as a decimal.
 * @type {!number}
 * @export
 */
API.Client.CampaignPlanningPointEstimate.prototype.doubleY;

/**
 * The maximum Y value of the point.
 * @type {!number}
 * @export
 */
API.Client.CampaignPlanningPointEstimate.prototype.maxY;

/**
 * The minimum Y value of the point.
 * @type {!number}
 * @export
 */
API.Client.CampaignPlanningPointEstimate.prototype.minY;

/**
 * The expected Y value of the point.
 * @type {!number}
 * @export
 */
API.Client.CampaignPlanningPointEstimate.prototype.y;

