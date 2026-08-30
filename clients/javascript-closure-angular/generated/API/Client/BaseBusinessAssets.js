goog.provide('API.Client.BaseBusinessAssets');

/**
 * An object containing the permissions a business has on the asset.
 * @record
 */
API.Client.BaseBusinessAssets = function() {}

/**
 * An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'.
 * @type {!API.Client.AssetGroupBinding}
 * @export
 */
API.Client.BaseBusinessAssets.prototype.assetGroupInfo;

/**
 * Unique identifier of a business asset.
 * @type {!string}
 * @export
 */
API.Client.BaseBusinessAssets.prototype.assetId;

/**
 * @type {!API.Client.AssetTypeResponse}
 * @export
 */
API.Client.BaseBusinessAssets.prototype.assetType;

/**
 * Permission levels the requesting business has on an asset.
 * @type {!Array<!string>}
 * @export
 */
API.Client.BaseBusinessAssets.prototype.permissions;

