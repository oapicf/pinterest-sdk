goog.provide('API.Client.DetailedError');

/**
 * Used for including extra details to a base error
 * @record
 */
API.Client.DetailedError = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.DetailedError.prototype.code;

/**
 * @type {!string}
 * @export
 */
API.Client.DetailedError.prototype.message;

/**
 * @type {!API.Client.Object}
 * @export
 */
API.Client.DetailedError.prototype.details;

