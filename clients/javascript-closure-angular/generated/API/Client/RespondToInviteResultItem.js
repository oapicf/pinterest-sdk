goog.provide('API.Client.RespondToInviteResultItem');

/**
 * @record
 */
API.Client.RespondToInviteResultItem = function() {}

/**
 * @type {!API.Client.InviteExceptionResponse}
 * @export
 */
API.Client.RespondToInviteResultItem.prototype.exception;

/**
 * An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created.
 * @type {!API.Client.BaseInviteDataResponse}
 * @export
 */
API.Client.RespondToInviteResultItem.prototype.invite;

