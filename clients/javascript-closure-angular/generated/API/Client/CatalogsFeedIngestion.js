goog.provide('API.Client.CatalogsFeedIngestion');

/**
 * @record
 */
API.Client.CatalogsFeedIngestion = function() {}

/**
 * Timestamp of the feed ingestion.
 * @type {!Date}
 * @export
 */
API.Client.CatalogsFeedIngestion.prototype.createdAt;

/**
 * Catalog Feed id pertaining to the feed ingestion.
 * @type {!string}
 * @export
 */
API.Client.CatalogsFeedIngestion.prototype.feedId;

/**
 * Unique identifier of a feed ingestion.
 * @type {!string}
 * @export
 */
API.Client.CatalogsFeedIngestion.prototype.id;

/**
 * Status of the feed ingestion.
 * @type {!API.Client.CatalogsFeedProcessingStatus}
 * @export
 */
API.Client.CatalogsFeedIngestion.prototype.status;

