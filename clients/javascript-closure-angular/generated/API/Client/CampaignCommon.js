goog.provide('API.Client.CampaignCommon');

/**
 * Campaign Data
 * @record
 */
API.Client.CampaignCommon = function() {}

/**
 * Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
 * @type {!string}
 * @export
 */
API.Client.CampaignCommon.prototype.adAccountId;

/**
 * Campaign name.
 * @type {!string}
 * @export
 */
API.Client.CampaignCommon.prototype.name;

/**
 * @type {!API.Client.EntityStatus}
 * @export
 */
API.Client.CampaignCommon.prototype.status;

/**
 * Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
 * @type {!number}
 * @export
 */
API.Client.CampaignCommon.prototype.lifetimeSpendCap;

/**
 * Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
 * @type {!number}
 * @export
 */
API.Client.CampaignCommon.prototype.dailySpendCap;

/**
 * Order line ID that appears on the invoice.
 * @type {!string}
 * @export
 */
API.Client.CampaignCommon.prototype.orderLineId;

/**
 * @type {!API.Client.AdCommon_tracking_urls}
 * @export
 */
API.Client.CampaignCommon.prototype.trackingUrls;

/**
 * Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
 * @type {!number}
 * @export
 */
API.Client.CampaignCommon.prototype.startTime;

/**
 * Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
 * @type {!number}
 * @export
 */
API.Client.CampaignCommon.prototype.endTime;

/**
 * @type {!API.Client.CampaignSummaryStatus}
 * @export
 */
API.Client.CampaignCommon.prototype.summaryStatus;

