goog.provide('API.Client.CampaignDeliveryEstimatesCampaign');

/**
 * Campaign configuration for delivery estimates.
 * @record
 */
API.Client.CampaignDeliveryEstimatesCampaign = function() {}

/**
 * @type {!Array<!API.Client.AdGroupDeliveryEstimates>}
 * @export
 */
API.Client.CampaignDeliveryEstimatesCampaign.prototype.adGroups;

/**
 * Duration type of the budget
 * @type {!API.Client.BudgetDurationType}
 * @export
 */
API.Client.CampaignDeliveryEstimatesCampaign.prototype.budgetDurationType;

/**
 * Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required.
 * @type {!number}
 * @export
 */
API.Client.CampaignDeliveryEstimatesCampaign.prototype.dailySpendCap;

/**
 * End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME.
 * @type {!string}
 * @export
 */
API.Client.CampaignDeliveryEstimatesCampaign.prototype.endDate;

/**
 * Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending.
 * @type {!number}
 * @export
 */
API.Client.CampaignDeliveryEstimatesCampaign.prototype.lifetimeSpendCap;

/**
 * @type {!API.Client.DeliveryEstimateObjectiveType}
 * @export
 */
API.Client.CampaignDeliveryEstimatesCampaign.prototype.objectiveType;

/**
 * Start date of the date range for an ad campaign, pattern YYYY-MM-DD.
 * @type {!string}
 * @export
 */
API.Client.CampaignDeliveryEstimatesCampaign.prototype.startDate;

