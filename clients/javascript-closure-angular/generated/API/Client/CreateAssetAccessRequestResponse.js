goog.provide('API.Client.CreateAssetAccessRequestResponse');

/**
 * @record
 */
API.Client.CreateAssetAccessRequestResponse = function() {}

/**
 * A list of errors associated with the asset access requests. Will be returned if there is an error.
 * @type {!Array<!API.Client.AssetAccessRequestError>}
 * @export
 */
API.Client.CreateAssetAccessRequestResponse.prototype.exceptions;

/**
 * An object mapping each partner id to the asset access request id. Only one request id is returned per partner.
 * @type {!Object<!string, string>}
 * @export
 */
API.Client.CreateAssetAccessRequestResponse.prototype.invites;

