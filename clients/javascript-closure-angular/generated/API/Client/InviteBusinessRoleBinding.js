goog.provide('API.Client.InviteBusinessRoleBinding');

/**
 * @record
 */
API.Client.InviteBusinessRoleBinding = function() {}

/**
 * Unique identifier of the invite/request.
 * @type {!string}
 * @export
 */
API.Client.InviteBusinessRoleBinding.prototype.id;

/**
 * @type {!API.Client.BaseInviteDataResponse_invite_data}
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
 * Metadata for the user that updated the invite/request.
 * @type {!API.Client.Object}
 * @export
 */
API.Client.InviteBusinessRoleBinding.prototype.user;

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

