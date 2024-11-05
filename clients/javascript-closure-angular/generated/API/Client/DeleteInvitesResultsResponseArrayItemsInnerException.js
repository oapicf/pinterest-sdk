goog.provide('API.Client.DeleteInvitesResultsResponseArray_items_inner_exception');

/**
 * An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
 * @record
 */
API.Client.DeleteInvitesResultsResponseArrayItemsInnerException = function() {}

/**
 * Unique identifier of an invite.
 * @type {!string}
 * @export
 */
API.Client.DeleteInvitesResultsResponseArrayItemsInnerException.prototype.inviteId;

/**
 * Error message associated with the error in performing the action on the invite/request.
 * @type {!string}
 * @export
 */
API.Client.DeleteInvitesResultsResponseArrayItemsInnerException.prototype.message;

