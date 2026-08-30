goog.provide('API.Client.InviteActionResultItem');

/**
 * An item representing the result of an invite/request action. Contains either an exception (on error) or an invite binding (on success).
 * @record
 */
API.Client.InviteActionResultItem = function() {}

/**
 * @type {!API.Client.InviteExceptionResponse}
 * @export
 */
API.Client.InviteActionResultItem.prototype.exception;

/**
 * @type {!API.Client.InviteBusinessRoleBinding}
 * @export
 */
API.Client.InviteActionResultItem.prototype.invite;

