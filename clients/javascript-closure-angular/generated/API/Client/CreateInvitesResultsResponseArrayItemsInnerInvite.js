goog.provide('API.Client.CreateInvitesResultsResponseArray_items_inner_invite');

/**
 * An invite object if the invite/request was successfully created. Will only be provided if the an invite/request is successfully created.
 * @record
 */
API.Client.CreateInvitesResultsResponseArrayItemsInnerInvite = function() {}

/**
 * Unique identifier of the invite/request.
 * @type {!string}
 * @export
 */
API.Client.CreateInvitesResultsResponseArrayItemsInnerInvite.prototype.id;

/**
 * Metadata for the member/partner that was sent the invite/request.
 * @type {!API.Client.BusinessAccessUserSummary}
 * @export
 */
API.Client.CreateInvitesResultsResponseArrayItemsInnerInvite.prototype.user;

