goog.provide('API.Client.OrderLineMutationError');

/**
 * @record
 */
API.Client.OrderLineMutationError = function() {}

/**
 * @type {!API.Client.OrderLine}
 * @export
 */
API.Client.OrderLineMutationError.prototype.data;

/**
 * Error messages.
 * @type {!Array<!string>}
 * @export
 */
API.Client.OrderLineMutationError.prototype.errorMessages;

