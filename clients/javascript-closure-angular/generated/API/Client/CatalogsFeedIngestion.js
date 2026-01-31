goog.provide('API.Client.CatalogsFeedIngestion');

/**
 * @record
 */
API.Client.CatalogsFeedIngestion = function() {}

/**
 * @type {!Date}
 * @export
 */
API.Client.CatalogsFeedIngestion.prototype.createdAt;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsFeedIngestion.prototype.feedId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsFeedIngestion.prototype.id;

/**
 * @type {!API.Client.CatalogsFeedProcessingStatus}
 * @export
 */
API.Client.CatalogsFeedIngestion.prototype.status;

