goog.provide('API.Client.CampaignResponse');

/**
 * @record
 */
API.Client.CampaignResponse = function() {}

/**
 * Campaign ID.
 * @type {!string}
 * @export
 */
API.Client.CampaignResponse.prototype.id;

/**
 * Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
 * @type {!string}
 * @export
 */
API.Client.CampaignResponse.prototype.adAccountId;

/**
 * Campaign name.
 * @type {!string}
 * @export
 */
API.Client.CampaignResponse.prototype.name;

/**
 * @type {!API.Client.EntityStatus}
 * @export
 */
API.Client.CampaignResponse.prototype.status;

/**
 * Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
 * @type {!number}
 * @export
 */
API.Client.CampaignResponse.prototype.lifetimeSpendCap;

/**
 * Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
 * @type {!number}
 * @export
 */
API.Client.CampaignResponse.prototype.dailySpendCap;

/**
 * Order line ID that appears on the invoice.
 * @type {!string}
 * @export
 */
API.Client.CampaignResponse.prototype.orderLineId;

/**
 * @type {!API.Client.AdCommon_tracking_urls}
 * @export
 */
API.Client.CampaignResponse.prototype.trackingUrls;

/**
 * Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
 * @type {!number}
 * @export
 */
API.Client.CampaignResponse.prototype.startTime;

/**
 * Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
 * @type {!number}
 * @export
 */
API.Client.CampaignResponse.prototype.endTime;

/**
 * @type {!API.Client.CampaignSummaryStatus}
 * @export
 */
API.Client.CampaignResponse.prototype.summaryStatus;

/**
 * @type {!API.Client.ObjectiveType}
 * @export
 */
API.Client.CampaignResponse.prototype.objectiveType;

/**
 * Campaign creation time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.CampaignResponse.prototype.createdTime;

/**
 * UTC timestamp. Last update time.
 * @type {!number}
 * @export
 */
API.Client.CampaignResponse.prototype.updatedTime;

/**
 * Always \"campaign\".
 * @type {!string}
 * @export
 */
API.Client.CampaignResponse.prototype.type;

/**
 * Determines if a campaign has flexible daily budgets setup.
 * @type {!boolean}
 * @export
 */
API.Client.CampaignResponse.prototype.isFlexibleDailyBudgets;

/**
 * Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
 * @type {!boolean}
 * @export
 */
API.Client.CampaignResponse.prototype.isCampaignBudgetOptimization;

