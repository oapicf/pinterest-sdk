goog.provide('API.Client.CancelInvitesBody');

/**
 * Request body used to cancel invites
 * @record
 */
API.Client.CancelInvitesBody = function() {}

/**
 * List of invite/request ids to be cancelled
 * @type {!Array<!string>}
 * @export
 */
API.Client.CancelInvitesBody.prototype.inviteIds;

