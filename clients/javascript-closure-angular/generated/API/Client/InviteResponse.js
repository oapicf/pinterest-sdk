goog.provide('API.Client.InviteResponse');

/**
 * A user's username or email OR a partner id that caused the error.
 * @record
 */
API.Client.InviteResponse = function() {}

/**
 * @type {!API.Client.InviteAssetsSummary}
 * @export
 */
API.Client.InviteResponse.prototype.assetsSummary;

/**
 * The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
 * @type {!Array<!string>}
 * @export
 */
API.Client.InviteResponse.prototype.businessRoles;

/**
 * Metadata for the business that created the invite/request.
 * @type {!API.Client.BusinessAccessUserSummary}
 * @export
 */
API.Client.InviteResponse.prototype.createdByBusiness;

/**
 * Metadata for the user that created the invite/request.
 * @type {!API.Client.BusinessAccessUserSummary}
 * @export
 */
API.Client.InviteResponse.prototype.createdByUser;

/**
 * The time the invite/request was created. Returned in milliseconds.
 * @type {!number}
 * @export
 */
API.Client.InviteResponse.prototype.createdTime;

/**
 * Unique identifier of the invite/request.
 * @type {!string}
 * @export
 */
API.Client.InviteResponse.prototype.id;

/**
 * @type {!API.Client.InviteDataResponse}
 * @export
 */
API.Client.InviteResponse.prototype.inviteData;

/**
 * Indicates whether the invite/request was received.
 * @type {!boolean}
 * @export
 */
API.Client.InviteResponse.prototype.isReceivedInvite;

/**
 * Metadata for the member/partner that was sent the invite/request.
 * @type {!API.Client.BusinessAccessUserSummary}
 * @export
 */
API.Client.InviteResponse.prototype.user;

