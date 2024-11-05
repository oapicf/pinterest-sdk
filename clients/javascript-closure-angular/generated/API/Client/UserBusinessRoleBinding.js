goog.provide('API.Client.UserBusinessRoleBinding');

/**
 * @record
 */
API.Client.UserBusinessRoleBinding = function() {}

/**
 * @type {!API.Client.BusinessMemberAssetsSummary}
 * @export
 */
API.Client.UserBusinessRoleBinding.prototype.assetsSummary;

/**
 * The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
 * @type {!Array<!string>}
 * @export
 */
API.Client.UserBusinessRoleBinding.prototype.businessRoles;

/**
 * Metadata for the business that created the business relationship.
 * @type {!API.Client.BusinessAccessUserSummary}
 * @export
 */
API.Client.UserBusinessRoleBinding.prototype.createdByBusiness;

/**
 * Metadata for the user that created the business relationship.
 * @type {!API.Client.BusinessAccessUserSummary}
 * @export
 */
API.Client.UserBusinessRoleBinding.prototype.createdByUser;

/**
 * The time the business relationship was created. Returned in milliseconds.
 * @type {!number}
 * @export
 */
API.Client.UserBusinessRoleBinding.prototype.createdTime;

/**
 * Unique identifier of the business member/business partner/employer.
 * @type {!string}
 * @export
 */
API.Client.UserBusinessRoleBinding.prototype.id;

/**
 * This field is only relevant when business_role=\"PARTNER\". <br>If is_shared_partner=FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. <br>If is_shared_partner=TRUE, you can access the partner's business asset. If assets_summary is not empty, the assets listed are the partner's business assets you have access to.
 * @type {!boolean}
 * @export
 */
API.Client.UserBusinessRoleBinding.prototype.isSharedPartner;

/**
 * Metadata for the business member/business partner/employer.
 * @type {!API.Client.BusinessAccessUserSummary}
 * @export
 */
API.Client.UserBusinessRoleBinding.prototype.user;

