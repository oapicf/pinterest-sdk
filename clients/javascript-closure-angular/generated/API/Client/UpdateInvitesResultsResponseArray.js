goog.provide('API.Client.UpdateInvitesResultsResponseArray');

/**
 * @record
 */
API.Client.UpdateInvitesResultsResponseArray = function() {}

/**
 * List of invite/Request action status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
 * @type {!Array<!API.Client.UpdateInvitesResultsResponseArray_items_inner>}
 * @export
 */
API.Client.UpdateInvitesResultsResponseArray.prototype.items;

