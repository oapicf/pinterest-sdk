goog.provide('API.Client.CampaignDeliveryEstimatesResponse');

/**
 * Delivery estimates response for a campaign.
 * @record
 */
API.Client.CampaignDeliveryEstimatesResponse = function() {}

/**
 * Estimated curves. Each curve will pertain to a single estimation type.
 * @type {!Array<!API.Client.CampaignPlanningCurveEstimate>}
 * @export
 */
API.Client.CampaignDeliveryEstimatesResponse.prototype.curves;

/**
 * @type {!API.Client.CampaignDeliveryEstimatesDerivedMetrics}
 * @export
 */
API.Client.CampaignDeliveryEstimatesResponse.prototype.derivedMetrics;

/**
 * Maximum potential spend estimate.
 * @type {!number}
 * @export
 */
API.Client.CampaignDeliveryEstimatesResponse.prototype.maxPotentialSpend;

