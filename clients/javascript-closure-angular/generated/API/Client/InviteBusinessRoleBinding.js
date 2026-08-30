goog.provide('API.Client.InviteBusinessRoleBinding');

/**
 * An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.
 * @record
 */
API.Client.InviteBusinessRoleBinding = function() {}

/**
 * Unique identifier for the business that created the invite/request.
 * @type {!string}
 * @export
 */
API.Client.InviteBusinessRoleBinding.prototype.createdByBusinessId;

/**
 * Unique identifier for the user that created the invite/request.
 * @type {!string}
 * @export
 */
API.Client.InviteBusinessRoleBinding.prototype.createdByUserId;

/**
 * Unique identifier of the invite/request.
 * @type {!string}
 * @export
 */
API.Client.InviteBusinessRoleBinding.prototype.id;

/**
 * @type {!API.Client.InviteDataResponse}
 * @export
 */
API.Client.InviteBusinessRoleBinding.prototype.inviteData;

/**
 * Indicates whether the invite/request was received.
 * @type {!boolean}
 * @export
 */
API.Client.InviteBusinessRoleBinding.prototype.isReceivedInvite;

/**
 * Metadata for the member/partner that was sent the invite/request.
 * @type {!API.Client.BusinessAccessUserSummary}
 * @export
 */
API.Client.InviteBusinessRoleBinding.prototype.user;

