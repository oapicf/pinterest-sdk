goog.provide('API.Client.DeleteInvitesResultsResponseArray');

/**
 * Response to delete invites sent to Members or Partners, if there is an exception, return the exception mapped with the invite id
 * @record
 */
API.Client.DeleteInvitesResultsResponseArray = function() {}

/**
 * List of invite/Request deletion status. If there is an error, an exception object will be returned. If the invite/request was successfully cancelled, an invite object will be returned for the invite that was cancelled.
 * @type {!Array<!API.Client.DeleteInvitesResultsResponseArray_items_inner>}
 * @export
 */
API.Client.DeleteInvitesResultsResponseArray.prototype.items;

