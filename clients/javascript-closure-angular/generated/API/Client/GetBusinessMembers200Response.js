goog.provide('API.Client.get_business_members_200_response');

/**
 * @record
 */
API.Client.GetBusinessMembers200Response = function() {}

/**
 * List of business members.
 * @type {!Array<!API.Client.UserBusinessRoleBinding>}
 * @export
 */
API.Client.GetBusinessMembers200Response.prototype.items;

/**
 * @type {!string}
 * @export
 */
API.Client.GetBusinessMembers200Response.prototype.bookmark;

