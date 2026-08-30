goog.provide('API.Client.CancelInvitesRequest');

/**
 * An object with the list of invite/request ids to cancel.
 * @record
 */
API.Client.CancelInvitesRequest = function() {}

/**
 * A list of invite/request ids to cancel.
 * @type {!Array<!string>}
 * @export
 */
API.Client.CancelInvitesRequest.prototype.inviteIds;

