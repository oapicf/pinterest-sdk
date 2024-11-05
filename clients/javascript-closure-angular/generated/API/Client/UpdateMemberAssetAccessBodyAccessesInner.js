goog.provide('API.Client.UpdateMemberAssetAccessBody_accesses_inner');

/**
 * @record
 */
API.Client.UpdateMemberAssetAccessBodyAccessesInner = function() {}

/**
 * Id of the asset to update.
 * @type {!string}
 * @export
 */
API.Client.UpdateMemberAssetAccessBodyAccessesInner.prototype.assetId;

/**
 * Unique identifier of the member on which to perform the update
 * @type {!string}
 * @export
 */
API.Client.UpdateMemberAssetAccessBodyAccessesInner.prototype.memberId;

/**
 * A non-empty array of permissions to assign to the member.
 * @type {!Array<!API.Client.Permissions>}
 * @export
 */
API.Client.UpdateMemberAssetAccessBodyAccessesInner.prototype.permissions;

