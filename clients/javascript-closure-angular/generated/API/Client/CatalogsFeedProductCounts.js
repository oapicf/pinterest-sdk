goog.provide('API.Client.CatalogsFeedProductCounts');

/**
 * The counts can be null early in the process.
 * @record
 */
API.Client.CatalogsFeedProductCounts = function() {}

/**
 * The number of products in the feed file.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedProductCounts.prototype.original;

/**
 * The number of products successfully ingested from the feed file.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedProductCounts.prototype.ingested;

