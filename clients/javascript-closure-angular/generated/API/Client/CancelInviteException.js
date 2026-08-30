goog.provide('API.Client.CancelInviteException');

/**
 * An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
 * @record
 */
API.Client.CancelInviteException = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CancelInviteException.prototype.inviteId;

/**
 * @type {!string}
 * @export
 */
API.Client.CancelInviteException.prototype.message;

