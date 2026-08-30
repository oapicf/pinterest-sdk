goog.provide('API.Client.CancelInviteResult');

/**
 * @record
 */
API.Client.CancelInviteResult = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CancelInviteResult.prototype.id;

/**
 * @type {!API.Client.InviteDataResponse}
 * @export
 */
API.Client.CancelInviteResult.prototype.inviteData;

/**
 * @type {!boolean}
 * @export
 */
API.Client.CancelInviteResult.prototype.isReceivedInvite;

/**
 * @type {!API.Client.CancelInviteResultUser}
 * @export
 */
API.Client.CancelInviteResult.prototype.user;

