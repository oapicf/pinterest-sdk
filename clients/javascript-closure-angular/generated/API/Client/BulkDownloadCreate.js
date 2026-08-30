goog.provide('API.Client.BulkDownloadCreate');

/**
 * Resource create operation model.
 * @record
 */
API.Client.BulkDownloadCreate = function() {}

/**
 * @type {!API.Client.BulkDownloadCampaignFilter}
 * @export
 */
API.Client.BulkDownloadCreate.prototype.campaignFilter;

/**
 * All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
 * @type {!Array<!string>}
 * @export
 */
API.Client.BulkDownloadCreate.prototype.entityIds;

/**
 * All entity types specified will be downloaded. Fewer types result in faster downloads.
 * @type {!Array<!API.Client.BulkEntityType>}
 * @export
 */
API.Client.BulkDownloadCreate.prototype.entityTypes;

/**
 * @type {!API.Client.BulkOutputFormat}
 * @export
 */
API.Client.BulkDownloadCreate.prototype.outputFormat;

/**
 * Unix UTC timestamp to retrieve all entities that have changed since this time.
 * @type {!string}
 * @export
 */
API.Client.BulkDownloadCreate.prototype.updatedSince;

