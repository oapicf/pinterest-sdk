goog.provide('API.Client.OrderLineMutationResult');

/**
 * @record
 */
API.Client.OrderLineMutationResult = function() {}

/**
 * Error list if update(s) fail.
 * @type {!Array<!API.Client.OrderLineMutationError>}
 * @export
 */
API.Client.OrderLineMutationResult.prototype.errors;

/**
 * Order Line object array.
 * @type {!Array<!API.Client.OrderLine>}
 * @export
 */
API.Client.OrderLineMutationResult.prototype.orderLine;

