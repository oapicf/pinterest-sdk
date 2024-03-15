goog.provide('API.Client.CampaignCreateRequest');

/**
 * @record
 */
API.Client.CampaignCreateRequest = function() {}

/**
 * Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
 * @type {!string}
 * @export
 */
API.Client.CampaignCreateRequest.prototype.adAccountId;

/**
 * Campaign name.
 * @type {!string}
 * @export
 */
API.Client.CampaignCreateRequest.prototype.name;

/**
 * @type {!API.Client.EntityStatus}
 * @export
 */
API.Client.CampaignCreateRequest.prototype.status;

/**
 * Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
 * @type {!number}
 * @export
 */
API.Client.CampaignCreateRequest.prototype.lifetimeSpendCap;

/**
 * Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
 * @type {!number}
 * @export
 */
API.Client.CampaignCreateRequest.prototype.dailySpendCap;

/**
 * Order line ID that appears on the invoice.
 * @type {!string}
 * @export
 */
API.Client.CampaignCreateRequest.prototype.orderLineId;

/**
 * @type {!API.Client.AdCommon_tracking_urls}
 * @export
 */
API.Client.CampaignCreateRequest.prototype.trackingUrls;

/**
 * Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
 * @type {!number}
 * @export
 */
API.Client.CampaignCreateRequest.prototype.startTime;

/**
 * Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
 * @type {!number}
 * @export
 */
API.Client.CampaignCreateRequest.prototype.endTime;

/**
 * @type {!API.Client.CampaignSummaryStatus}
 * @export
 */
API.Client.CampaignCreateRequest.prototype.summaryStatus;

/**
 * Determine if a campaign has flexible daily budgets setup.
 * @type {!boolean}
 * @export
 */
API.Client.CampaignCreateRequest.prototype.isFlexibleDailyBudgets;

/**
 * When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
 * @type {!number}
 * @export
 */
API.Client.CampaignCreateRequest.prototype.defaultAdGroupBudgetInMicroCurrency;

/**
 * Specifies whether the campaign was created in the automated campaign flow
 * @type {!boolean}
 * @export
 */
API.Client.CampaignCreateRequest.prototype.isAutomatedCampaign;

/**
 * @type {!API.Client.ObjectiveType}
 * @export
 */
API.Client.CampaignCreateRequest.prototype.objectiveType;

