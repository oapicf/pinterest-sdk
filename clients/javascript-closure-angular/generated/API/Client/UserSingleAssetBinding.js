goog.provide('API.Client.UserSingleAssetBinding');

/**
 * An object containing the permissions a business member/partner has on the asset.
 * @record
 */
API.Client.UserSingleAssetBinding = function() {}

/**
 * Permission levels member or partner has on an asset.
 * @type {!Array<!string>}
 * @export
 */
API.Client.UserSingleAssetBinding.prototype.permissions;

/**
 * @type {!API.Client.BusinessAccessUserSummary}
 * @export
 */
API.Client.UserSingleAssetBinding.prototype.user;

