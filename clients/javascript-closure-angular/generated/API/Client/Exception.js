goog.provide('API.Client.Exception');

/**
 * @record
 */
API.Client.Exception = function() {}

/**
 * Exception error code.
 * @type {!number}
 * @export
 */
API.Client.Exception.prototype.code;

/**
 * Exception message.
 * @type {!string}
 * @export
 */
API.Client.Exception.prototype.message;

