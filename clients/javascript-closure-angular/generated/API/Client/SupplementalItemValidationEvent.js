goog.provide('API.Client.SupplementalItemValidationEvent');

/**
 * Item validation event
 * @record
 */
API.Client.SupplementalItemValidationEvent = function() {}

/**
 * The item attribute referenced by the validation event eg. price, availability, ad_link
 * @type {!string}
 * @export
 */
API.Client.SupplementalItemValidationEvent.prototype.attribute;

/**
 * The event code that the item validation event references
 * @type {!number}
 * @export
 */
API.Client.SupplementalItemValidationEvent.prototype.code;

/**
 * Title message describing the item validation event
 * @type {!string}
 * @export
 */
API.Client.SupplementalItemValidationEvent.prototype.message;

