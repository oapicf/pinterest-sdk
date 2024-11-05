goog.provide('API.Client.RespondToInvitesResponseArray');

/**
 * @record
 */
API.Client.RespondToInvitesResponseArray = function() {}

/**
 * List of invite/request accept/decline status. If there is an error, an exception object will be returned. If the invite/request was successfully accepted/declined, an invite object will be returned.
 * @type {!Array<!API.Client.RespondToInvitesResponseArray_items_inner>}
 * @export
 */
API.Client.RespondToInvitesResponseArray.prototype.items;

