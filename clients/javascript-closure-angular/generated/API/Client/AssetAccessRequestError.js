goog.provide('API.Client.AssetAccessRequestError');

/**
 * @record
 */
API.Client.AssetAccessRequestError = function() {}

/**
 * Error code associated with the error in requesting asset access.
 * @type {!number}
 * @export
 */
API.Client.AssetAccessRequestError.prototype.code;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.AssetAccessRequestError.prototype.messages;

