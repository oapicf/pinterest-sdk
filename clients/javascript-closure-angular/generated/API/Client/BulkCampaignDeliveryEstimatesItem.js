goog.provide('API.Client.BulkCampaignDeliveryEstimatesItem');

/**
 * Delivery estimate result for a single campaign within a bulk request.
 * @record
 */
API.Client.BulkCampaignDeliveryEstimatesItem = function() {}

/**
 * Range audience sizes for each ad group, in the same order as the ad groups in the request.
 * @type {!Array<!API.Client.CampaignPlanningAdGroupAudienceSize>}
 * @export
 */
API.Client.BulkCampaignDeliveryEstimatesItem.prototype.adgroupAudienceSizes;

/**
 * Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows.
 * @type {!number}
 * @export
 */
API.Client.BulkCampaignDeliveryEstimatesItem.prototype.conversionRate;

/**
 * Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings.
 * @type {!Array<!API.Client.CampaignPlanningConversionRate>}
 * @export
 */
API.Client.BulkCampaignDeliveryEstimatesItem.prototype.conversionRates;

/**
 * Estimated curves. Each curve will pertain to a single estimation type.
 * @type {!Array<!API.Client.CampaignPlanningCurveEstimate>}
 * @export
 */
API.Client.BulkCampaignDeliveryEstimatesItem.prototype.curves;

/**
 * @type {!API.Client.CampaignDeliveryEstimatesDerivedMetrics}
 * @export
 */
API.Client.BulkCampaignDeliveryEstimatesItem.prototype.derivedMetrics;

/**
 * Errors encountered during estimation for this campaign.
 * @type {!Array<!API.Client.CampaignPlanningResponseError>}
 * @export
 */
API.Client.BulkCampaignDeliveryEstimatesItem.prototype.errors;

/**
 * UUID used to track delivery estimates when they are generated as part of a saved campaign.
 * @type {!string}
 * @export
 */
API.Client.BulkCampaignDeliveryEstimatesItem.prototype.estimateId;

/**
 * Maximum potential spend estimate.
 * @type {!number}
 * @export
 */
API.Client.BulkCampaignDeliveryEstimatesItem.prototype.maxPotentialSpend;

