goog.provide('API.Client.AuthRespondInvitesBody_invites_inner_action');

/**
 * @record
 */
API.Client.AuthRespondInvitesBodyInvitesInnerAction = function() {}

/**
 * Whether the invite/request is accepted.
 * @type {!boolean}
 * @export
 */
API.Client.AuthRespondInvitesBodyInvitesInnerAction.prototype.acceptInvite;

/**
 * An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
 * @type {!Object<!string, Array<!API.Client.Permissions>>}
 * @export
 */
API.Client.AuthRespondInvitesBodyInvitesInnerAction.prototype.assetIdToPermissions;

