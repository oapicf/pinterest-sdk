goog.provide('API.Client.DeleteMemberAssetAccessItem');

/**
 * @record
 */
API.Client.DeleteMemberAssetAccessItem = function() {}

/**
 * Id of the asset on which to remove member permissions.
 * @type {!string}
 * @export
 */
API.Client.DeleteMemberAssetAccessItem.prototype.assetId;

/**
 * Unique identifier of the member on which to perform the asset permission removal
 * @type {!string}
 * @export
 */
API.Client.DeleteMemberAssetAccessItem.prototype.memberId;

