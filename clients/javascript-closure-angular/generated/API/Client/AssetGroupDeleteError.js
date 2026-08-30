goog.provide('API.Client.AssetGroupDeleteError');

/**
 * @record
 */
API.Client.AssetGroupDeleteError = function() {}

/**
 * Asset group id of the exception.
 * @type {!string}
 * @export
 */
API.Client.AssetGroupDeleteError.prototype.assetGroupId;

/**
 * Error code associated with the error deleting asset group.
 * @type {!number}
 * @export
 */
API.Client.AssetGroupDeleteError.prototype.code;

/**
 * Error message associated with the error deleting asset group.
 * @type {!string}
 * @export
 */
API.Client.AssetGroupDeleteError.prototype.message;

