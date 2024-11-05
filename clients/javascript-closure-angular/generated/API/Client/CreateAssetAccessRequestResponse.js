goog.provide('API.Client.CreateAssetAccessRequestResponse');

/**
 * @record
 */
API.Client.CreateAssetAccessRequestResponse = function() {}

/**
 * A list of errors associated with the asset access requests. Will be returned if there is an error.
 * @type {!Array<!API.Client.CreateAssetAccessRequestErrorMessage_inner>}
 * @export
 */
API.Client.CreateAssetAccessRequestResponse.prototype.exceptions;

/**
 * @type {!Object<!string, string>}
 * @export
 */
API.Client.CreateAssetAccessRequestResponse.prototype.invites;

