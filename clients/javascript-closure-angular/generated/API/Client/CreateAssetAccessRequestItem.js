goog.provide('API.Client.CreateAssetAccessRequestItem');

/**
 * @record
 */
API.Client.CreateAssetAccessRequestItem = function() {}

/**
 * An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.
 * @type {!Object<!string, API.Client.Array>}
 * @export
 */
API.Client.CreateAssetAccessRequestItem.prototype.assetIdToPermissions;

/**
 * Unique identifier of a business partner to request asset access to.
 * @type {!string}
 * @export
 */
API.Client.CreateAssetAccessRequestItem.prototype.partnerId;

