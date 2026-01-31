goog.provide('API.Client.BulkDownloadRequest');

/**
 * Ad entities to get in bulk request.
 * @record
 */
API.Client.BulkDownloadRequest = function() {}

/**
 * @type {!API.Client.BulkDownloadRequest_campaign_filter}
 * @export
 */
API.Client.BulkDownloadRequest.prototype.campaignFilter;

/**
 * All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
 * @type {!Array<!string>}
 * @export
 */
API.Client.BulkDownloadRequest.prototype.entityIds;

/**
 * All entity types specified will be downloaded. Fewer types result in faster downloads.
 * @type {!Array<!API.Client.BulkEntityType>}
 * @export
 */
API.Client.BulkDownloadRequest.prototype.entityTypes;

/**
 * @type {!API.Client.BulkOutputFormat}
 * @export
 */
API.Client.BulkDownloadRequest.prototype.outputFormat;

/**
 * Unix UTC timestamp to retrieve all entities that have changed since this time.
 * @type {!string}
 * @export
 */
API.Client.BulkDownloadRequest.prototype.updatedSince;

