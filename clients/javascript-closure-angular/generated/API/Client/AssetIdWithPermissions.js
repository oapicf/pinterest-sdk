goog.provide('API.Client.AssetIdWithPermissions');

/**
 * Asset ID with permission levels.
 * @record
 */
API.Client.AssetIdWithPermissions = function() {}

/**
 * Unique identifier of a business asset.
 * @type {!string}
 * @export
 */
API.Client.AssetIdWithPermissions.prototype.id;

/**
 * Permission levels member or partner has on an asset.
 * @type {!Array<!string>}
 * @export
 */
API.Client.AssetIdWithPermissions.prototype.permissions;

