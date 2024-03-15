goog.provide('API.Client.OrderLineResponse');

/**
 * @record
 */
API.Client.OrderLineResponse = function() {}

/**
 * Error list if update(s) fail.
 * @type {!Array<!API.Client.OrderLineError>}
 * @export
 */
API.Client.OrderLineResponse.prototype.errors;

/**
 * Order Line object array.
 * @type {!Array<!API.Client.OrderLine>}
 * @export
 */
API.Client.OrderLineResponse.prototype.orderLine;

