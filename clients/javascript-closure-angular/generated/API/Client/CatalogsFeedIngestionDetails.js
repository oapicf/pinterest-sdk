goog.provide('API.Client.CatalogsFeedIngestionDetails');

/**
 * @record
 */
API.Client.CatalogsFeedIngestionDetails = function() {}

/**
 * @type {!API.Client.CatalogsFeedIngestionErrors}
 * @export
 */
API.Client.CatalogsFeedIngestionDetails.prototype.errors;

/**
 * @type {!API.Client.CatalogsFeedIngestionInfo}
 * @export
 */
API.Client.CatalogsFeedIngestionDetails.prototype.info;

/**
 * @type {!API.Client.CatalogsFeedIngestionWarnings}
 * @export
 */
API.Client.CatalogsFeedIngestionDetails.prototype.warnings;

