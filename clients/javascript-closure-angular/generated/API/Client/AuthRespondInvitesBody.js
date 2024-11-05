goog.provide('API.Client.AuthRespondInvitesBody');

/**
 * An object with a list of all the invites the user would like to respond to and the action to take.
 * @record
 */
API.Client.AuthRespondInvitesBody = function() {}

/**
 * @type {!Array<!API.Client.AuthRespondInvitesBody_invites_inner>}
 * @export
 */
API.Client.AuthRespondInvitesBody.prototype.invites;

