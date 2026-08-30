goog.provide('API.Client.AssetIdPermissions');

/**
 * An object containing the permissions a business member has on the asset.
 * @record
 */
API.Client.AssetIdPermissions = function() {}

/**
 * An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'.
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
 * @type {!API.Client.AssetTypeResponse}
 * @export
 */
API.Client.AssetIdPermissions.prototype.assetType;

/**
 * Permission levels member or partner has on an asset.
 * @type {!Array<!string>}
 * @export
 */
API.Client.AssetIdPermissions.prototype.permissions;

