goog.provide('API.Client.ErrorDetail');

/**
 * @record
 */
API.Client.ErrorDetail = function() {}

/**
 * Number of records with this error
 * @type {!number}
 * @export
 */
API.Client.ErrorDetail.prototype.count;

/**
 * Numeric error code
 * @type {!number}
 * @export
 */
API.Client.ErrorDetail.prototype.errorCode;

/**
 * Error message description
 * @type {!string}
 * @export
 */
API.Client.ErrorDetail.prototype.message;

