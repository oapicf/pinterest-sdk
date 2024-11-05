goog.provide('API.Client.get_invites_200_response');

/**
 * @record
 */
API.Client.GetInvites200Response = function() {}

/**
 * List of invite and request data.
 * @type {!Array<!API.Client.InviteResponse>}
 * @export
 */
API.Client.GetInvites200Response.prototype.items;

/**
 * @type {!string}
 * @export
 */
API.Client.GetInvites200Response.prototype.bookmark;

