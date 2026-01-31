goog.provide('API.Client.AssetIdPermissions');

/**
 * An object containing the permissions a business member has on the asset.
 * @record
 */
API.Client.AssetIdPermissions = function() {}

/**
 * @type {!API.Client.AssetGroupBinding}
 * @export
 */
API.Client.AssetIdPermissions.prototype.assetGroupInfo;

/**
 * Unique identifier of a business asset.
 * @type {!string}
 * @export
 */
API.Client.AssetIdPermissions.prototype.assetId;

/**
 * Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
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

