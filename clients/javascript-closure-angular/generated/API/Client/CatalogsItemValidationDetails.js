goog.provide('API.Client.CatalogsItemValidationDetails');

/**
 * @record
 */
API.Client.CatalogsItemValidationDetails = function() {}

/**
 * Attribute that has a validation issue.
 * @type {!API.Client.NullableCatalogsItemFieldType}
 * @export
 */
API.Client.CatalogsItemValidationDetails.prototype.attributeName;

/**
 * Provided value that caused the validation issue.
 * @type {!string}
 * @export
 */
API.Client.CatalogsItemValidationDetails.prototype.providedValue;

