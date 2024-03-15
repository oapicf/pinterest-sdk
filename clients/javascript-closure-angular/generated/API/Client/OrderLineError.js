goog.provide('API.Client.OrderLineError');

/**
 * @record
 */
API.Client.OrderLineError = function() {}

/**
 * @type {!API.Client.OrderLine}
 * @export
 */
API.Client.OrderLineError.prototype.data;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.OrderLineError.prototype.errorMessages;

