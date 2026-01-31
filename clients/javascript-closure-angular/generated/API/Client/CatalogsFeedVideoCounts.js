goog.provide('API.Client.CatalogsFeedVideoCounts');

/**
 * Counts of total, ingested, and not ingested videos in the feed file. The counts may not appear early in the process.
 * @record
 */
API.Client.CatalogsFeedVideoCounts = function() {}

/**
 * The number of videos successfully ingested from the feed file.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedVideoCounts.prototype.ingestedVideos;

/**
 * The number of videos that were not ingested from the feed file.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedVideoCounts.prototype.notIngestedVideos;

/**
 * The number of videos in the feed file.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedVideoCounts.prototype.totalVideos;

