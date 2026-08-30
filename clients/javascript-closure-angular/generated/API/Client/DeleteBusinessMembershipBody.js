goog.provide('API.Client.DeleteBusinessMembershipBody');

/**
 * List of members with role to delete.
 * @record
 */
API.Client.DeleteBusinessMembershipBody = function() {}

/**
 * @type {!Array<!API.Client.DeleteBusinessMembershipMember>}
 * @export
 */
API.Client.DeleteBusinessMembershipBody.prototype.members;

