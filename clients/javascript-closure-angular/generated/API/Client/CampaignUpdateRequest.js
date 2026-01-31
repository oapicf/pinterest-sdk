goog.provide('API.Client.CampaignUpdateRequest');

/**
 * @record
 */
API.Client.CampaignUpdateRequest = function() {}

/**
 * Campaign ID.
 * @type {!string}
 * @export
 */
API.Client.CampaignUpdateRequest.prototype.id;

/**
 * Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
 * @type {!string}
 * @export
 */
API.Client.CampaignUpdateRequest.prototype.adAccountId;

/**
 * Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
 * @type {!number}
 * @export
 */
API.Client.CampaignUpdateRequest.prototype.dailySpendCap;

/**
 * Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
 * @type {!number}
 * @export
 */
API.Client.CampaignUpdateRequest.prototype.endTime;

/**
 * Specifies whether the campaign was created in the automated campaign flow
 * @type {!boolean}
 * @export
 */
API.Client.CampaignUpdateRequest.prototype.isAutomatedCampaign;

/**
 * Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\".
 * @type {!boolean}
 * @export
 */
API.Client.CampaignUpdateRequest.prototype.isFlexibleDailyBudgets;

/**
 * Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
 * @type {!number}
 * @export
 */
API.Client.CampaignUpdateRequest.prototype.lifetimeSpendCap;

/**
 * Campaign name.
 * @type {!string}
 * @export
 */
API.Client.CampaignUpdateRequest.prototype.name;

/**
 * Order line ID that appears on the invoice.
 * @type {!string}
 * @export
 */
API.Client.CampaignUpdateRequest.prototype.orderLineId;

/**
 * Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
 * @type {!number}
 * @export
 */
API.Client.CampaignUpdateRequest.prototype.startTime;

/**
 * @type {!API.Client.EntityStatus}
 * @export
 */
API.Client.CampaignUpdateRequest.prototype.status;

/**
 * @type {!API.Client.TrackingUrls}
 * @export
 */
API.Client.CampaignUpdateRequest.prototype.trackingUrls;

/**
 * When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
 * @type {!number}
 * @export
 */
API.Client.CampaignUpdateRequest.prototype.defaultAdGroupBudgetInMicroCurrency;

/**
 * Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
 * @type {!boolean}
 * @export
 */
API.Client.CampaignUpdateRequest.prototype.isCampaignBudgetOptimization;

/**
 * @type {!API.Client.CampaignBidOptionsUpdate}
 * @export
 */
API.Client.CampaignUpdateRequest.prototype.bidOptions;

/**
 * Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. This field is immutable, except only for campaigns in draft status which may update this field.
 * @type {!boolean}
 * @export
 */
API.Client.CampaignUpdateRequest.prototype.isPerformancePlus;

/**
 * @type {!API.Client.ObjectiveType}
 * @export
 */
API.Client.CampaignUpdateRequest.prototype.objectiveType;

