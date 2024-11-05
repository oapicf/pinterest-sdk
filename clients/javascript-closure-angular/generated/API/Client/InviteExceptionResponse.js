goog.provide('API.Client.InviteExceptionResponse');

/**
 * An exception object if there is an error performing the action. Will only be provided if there is an error.
 * @record
 */
API.Client.InviteExceptionResponse = function() {}

/**
 * Unique identifier of the invite/request.
 * @type {!string}
 * @export
 */
API.Client.InviteExceptionResponse.prototype.inviteOrRequestId;

/**
 * Error code associated with the error in performing the action on the invite/request.
 * @type {!number}
 * @export
 */
API.Client.InviteExceptionResponse.prototype.code;

/**
 * Error message associated with the error in performing the action on the invite/request.
 * @type {!string}
 * @export
 */
API.Client.InviteExceptionResponse.prototype.message;

/**
 * A list of users' usernames or emails OR a list of partner ids that caused the error.
 * @type {!Array<!string>}
 * @export
 */
API.Client.InviteExceptionResponse.prototype.usersOrPartnerIds;

