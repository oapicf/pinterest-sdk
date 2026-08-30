goog.provide('API.Client.AuthRespondInvitesBodyItem');

/**
 * @record
 */
API.Client.AuthRespondInvitesBodyItem = function() {}

/**
 * @type {!API.Client.AuthRespondInviteAction}
 * @export
 */
API.Client.AuthRespondInvitesBodyItem.prototype.action;

/**
 * Unique identifier of an invite.
 * @type {!string}
 * @export
 */
API.Client.AuthRespondInvitesBodyItem.prototype.inviteId;

