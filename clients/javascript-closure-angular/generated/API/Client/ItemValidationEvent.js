goog.provide('API.Client.ItemValidationEvent');

/**
 * Object describing an item validation event
 * @record
 */
API.Client.ItemValidationEvent = function() {}

/**
 * The attribute that the item validation event references
 * @type {!string}
 * @export
 */
API.Client.ItemValidationEvent.prototype.attribute;

/**
 * The event code that the item validation event references
 * @type {!number}
 * @export
 */
API.Client.ItemValidationEvent.prototype.code;

/**
 * Title message describing the item validation event
 * @type {!string}
 * @export
 */
API.Client.ItemValidationEvent.prototype.message;

