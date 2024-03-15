goog.provide('API.Client.BulkDownloadRequest_campaign_filter');

/**
 * @record
 */
API.Client.BulkDownloadRequestCampaignFilter = function() {}

/**
 * Unix UTC timestamp.
 * @type {!string}
 * @export
 */
API.Client.BulkDownloadRequestCampaignFilter.prototype.startTime;

/**
 * Unix UTC timestamp.
 * @type {!string}
 * @export
 */
API.Client.BulkDownloadRequestCampaignFilter.prototype.endTime;

/**
 * Campaign name
 * @type {!string}
 * @export
 */
API.Client.BulkDownloadRequestCampaignFilter.prototype.name;

/**
 * @type {!Array<!API.Client.CampaignSummaryStatus>}
 * @export
 */
API.Client.BulkDownloadRequestCampaignFilter.prototype.campaignStatus;

/**
 * @type {!Array<!API.Client.ObjectiveType>}
 * @export
 */
API.Client.BulkDownloadRequestCampaignFilter.prototype.objectiveType;

