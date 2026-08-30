goog.provide('API.Client.BusinessMembershipMember');

/**
 * A business member identified by `member_id` with their `business_role` in the business.
 * @record
 */
API.Client.BusinessMembershipMember = function() {}

/**
 * @type {!API.Client.BusinessRoleForMembers}
 * @export
 */
API.Client.BusinessMembershipMember.prototype.businessRole;

/**
 * Unique identifier of the member.
 * @type {!string}
 * @export
 */
API.Client.BusinessMembershipMember.prototype.memberId;

