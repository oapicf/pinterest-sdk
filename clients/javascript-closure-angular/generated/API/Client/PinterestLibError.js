goog.provide('API.Client.Pinterest.Lib.Error');

/**
 * Default error response
 * @record
 */
API.Client.PinterestLibError = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PinterestLibError.prototype.code;

/**
 * @type {!string}
 * @export
 */
API.Client.PinterestLibError.prototype.message;

