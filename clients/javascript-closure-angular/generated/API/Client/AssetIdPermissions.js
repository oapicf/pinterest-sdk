goog.provide('API.Client.AssetIdPermissions');

/**
 * An object containing the permissions a business member has on the asset.
 * @record
 */
API.Client.AssetIdPermissions = function() {}

/**
 * Unique identifier of a business asset.
 * @type {!string}
 * @export
 */
API.Client.AssetIdPermissions.prototype.assetId;

/**
 * Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
 * @type {!string}
 * @export
 */
API.Client.AssetIdPermissions.prototype.assetType;

/**
 * Permission levels member or partner has on an asset.
 * @type {!Array<!string>}
 * @export
 */
API.Client.AssetIdPermissions.prototype.permissions;

/**
 * @type {!API.Client.AssetGroupBinding}
 * @export
 */
API.Client.AssetIdPermissions.prototype.assetGroupInfo;

