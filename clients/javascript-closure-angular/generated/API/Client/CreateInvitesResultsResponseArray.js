goog.provide('API.Client.CreateInvitesResultsResponseArray');

/**
 * @record
 */
API.Client.CreateInvitesResultsResponseArray = function() {}

/**
 * List of invite/request creation status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
 * @type {!Array<!API.Client.CreateInvitesResultsResponseArray_items_inner>}
 * @export
 */
API.Client.CreateInvitesResultsResponseArray.prototype.items;

