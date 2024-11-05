goog.provide('API.Client.CatalogsFeedIngestion');

/**
 * @record
 */
API.Client.CatalogsFeedIngestion = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsFeedIngestion.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsFeedIngestion.prototype.feedId;

/**
 * @type {!Date}
 * @export
 */
API.Client.CatalogsFeedIngestion.prototype.createdAt;

/**
 * @type {!API.Client.CatalogsFeedProcessingStatus}
 * @export
 */
API.Client.CatalogsFeedIngestion.prototype.status;

