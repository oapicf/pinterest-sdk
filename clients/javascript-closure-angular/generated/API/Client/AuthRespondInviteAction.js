goog.provide('API.Client.AuthRespondInviteAction');

/**
 * @record
 */
API.Client.AuthRespondInviteAction = function() {}

/**
 * Whether the invite/request is accepted.
 * @type {!boolean}
 * @export
 */
API.Client.AuthRespondInviteAction.prototype.acceptInvite;

/**
 * An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.
 * @type {!Object<!string, API.Client.Array>}
 * @export
 */
API.Client.AuthRespondInviteAction.prototype.assetIdToPermissions;

