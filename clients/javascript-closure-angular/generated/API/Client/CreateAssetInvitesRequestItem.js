goog.provide('API.Client.CreateAssetInvitesRequestItem');

/**
 * Object declaring an asset role update to an invite.
 * @record
 */
API.Client.CreateAssetInvitesRequestItem = function() {}

/**
 * An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.
 * @type {!Object<!string, API.Client.Array>}
 * @export
 */
API.Client.CreateAssetInvitesRequestItem.prototype.assetIdToPermissions;

/**
 * Unique identifier of an invite.
 * @type {!string}
 * @export
 */
API.Client.CreateAssetInvitesRequestItem.prototype.inviteId;

/**
 * @type {!API.Client.InviteType}
 * @export
 */
API.Client.CreateAssetInvitesRequestItem.prototype.inviteType;

