goog.provide('API.Client.UpdateMemberAssetAccessItem');

/**
 * @record
 */
API.Client.UpdateMemberAssetAccessItem = function() {}

/**
 * Id of the asset to update.
 * @type {!string}
 * @export
 */
API.Client.UpdateMemberAssetAccessItem.prototype.assetId;

/**
 * Unique identifier of the member on which to perform the update
 * @type {!string}
 * @export
 */
API.Client.UpdateMemberAssetAccessItem.prototype.memberId;

/**
 * A non-empty array of permissions to assign to the member.
 * @type {!Array<!API.Client.Permissions>}
 * @export
 */
API.Client.UpdateMemberAssetAccessItem.prototype.permissions;

