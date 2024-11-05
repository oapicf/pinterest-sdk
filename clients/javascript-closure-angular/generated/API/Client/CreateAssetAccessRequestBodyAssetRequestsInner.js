goog.provide('API.Client.CreateAssetAccessRequestBody_asset_requests_inner');

/**
 * @record
 */
API.Client.CreateAssetAccessRequestBodyAssetRequestsInner = function() {}

/**
 * Unique identifier of a business partner to request asset access to.
 * @type {!string}
 * @export
 */
API.Client.CreateAssetAccessRequestBodyAssetRequestsInner.prototype.partnerId;

/**
 * An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
 * @type {!Object<!string, Array<!API.Client.Permissions>>}
 * @export
 */
API.Client.CreateAssetAccessRequestBodyAssetRequestsInner.prototype.assetIdToPermissions;

