goog.provide('API.Client.BulkDownloadCampaignFilter');

/**
 * @record
 */
API.Client.BulkDownloadCampaignFilter = function() {}

/**
 * @type {!Array<!API.Client.SummaryStatus>}
 * @export
 */
API.Client.BulkDownloadCampaignFilter.prototype.campaignStatus;

/**
 * Unix UTC timestamp.
 * @type {!string}
 * @export
 */
API.Client.BulkDownloadCampaignFilter.prototype.endTime;

/**
 * Campaign name
 * @type {!string}
 * @export
 */
API.Client.BulkDownloadCampaignFilter.prototype.name;

/**
 * @type {!Array<!API.Client.ConversionObjectiveType>}
 * @export
 */
API.Client.BulkDownloadCampaignFilter.prototype.objectiveType;

/**
 * Unix UTC timestamp.
 * @type {!string}
 * @export
 */
API.Client.BulkDownloadCampaignFilter.prototype.startTime;

