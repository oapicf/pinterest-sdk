goog.provide('API.Client.CatalogsFeedValidationDetails');

/**
 * @record
 */
API.Client.CatalogsFeedValidationDetails = function() {}

/**
 * @type {!API.Client.CatalogsFeedValidationErrors}
 * @export
 */
API.Client.CatalogsFeedValidationDetails.prototype.errors;

/**
 * @type {!API.Client.CatalogsFeedValidationWarnings}
 * @export
 */
API.Client.CatalogsFeedValidationDetails.prototype.warnings;

