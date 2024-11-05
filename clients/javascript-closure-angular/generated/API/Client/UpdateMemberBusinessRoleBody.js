goog.provide('API.Client.UpdateMemberBusinessRoleBody');

/**
 * Single instance of a business member to have its role updated
 * @record
 */
API.Client.UpdateMemberBusinessRoleBody = function() {}

/**
 * @type {!API.Client.BusinessRoleForMembers}
 * @export
 */
API.Client.UpdateMemberBusinessRoleBody.prototype.businessRole;

/**
 * Unique identifier of the member
 * @type {!string}
 * @export
 */
API.Client.UpdateMemberBusinessRoleBody.prototype.memberId;

