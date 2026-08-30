goog.provide('API.Client.Exception');

/**
 * @record
 */
API.Client.Exception = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.Exception.prototype.code;

/**
 * @type {!string}
 * @export
 */
API.Client.Exception.prototype.message;

