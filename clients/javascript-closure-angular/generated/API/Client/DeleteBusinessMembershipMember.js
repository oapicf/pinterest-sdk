goog.provide('API.Client.DeleteBusinessMembershipMember');

/**
 * Single instance of a business member to be removed from the business.
 * @record
 */
API.Client.DeleteBusinessMembershipMember = function() {}

/**
 * @type {!API.Client.BusinessRoleForMembers}
 * @export
 */
API.Client.DeleteBusinessMembershipMember.prototype.businessRole;

/**
 * Unique identifier of the member
 * @type {!string}
 * @export
 */
API.Client.DeleteBusinessMembershipMember.prototype.memberId;

