goog.provide('API.Client.CatalogsItemValidationIssues');

/**
 * @record
 */
API.Client.CatalogsItemValidationIssues = function() {}

/**
 * Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
 * @type {!number}
 * @export
 */
API.Client.CatalogsItemValidationIssues.prototype.itemNumber;

/**
 * The merchant-created unique ID that represents the product.
 * @type {!string}
 * @export
 */
API.Client.CatalogsItemValidationIssues.prototype.itemId;

/**
 * @type {!API.Client.CatalogsItemValidationErrors}
 * @export
 */
API.Client.CatalogsItemValidationIssues.prototype.errors;

/**
 * @type {!API.Client.CatalogsItemValidationWarnings}
 * @export
 */
API.Client.CatalogsItemValidationIssues.prototype.warnings;

