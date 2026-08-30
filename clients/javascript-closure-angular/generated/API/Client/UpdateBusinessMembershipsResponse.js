goog.provide('API.Client.UpdateBusinessMembershipsResponse');

/**
 * @record
 */
API.Client.UpdateBusinessMembershipsResponse = function() {}

/**
 * List of members with updated business access role.
 * @type {!Array<!API.Client.BusinessMembershipMember>}
 * @export
 */
API.Client.UpdateBusinessMembershipsResponse.prototype.items;

