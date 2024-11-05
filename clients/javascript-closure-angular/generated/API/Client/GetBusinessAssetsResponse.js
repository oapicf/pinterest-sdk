goog.provide('API.Client.GetBusinessAssetsResponse');

/**
 * An object containing the permissions a business has on the asset.
 * @record
 */
API.Client.GetBusinessAssetsResponse = function() {}

/**
 * Unique identifier of a business asset.
 * @type {!string}
 * @export
 */
API.Client.GetBusinessAssetsResponse.prototype.assetId;

/**
 * Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
 * @type {!string}
 * @export
 */
API.Client.GetBusinessAssetsResponse.prototype.assetType;

/**
 * @type {!API.Client.AssetGroupBinding}
 * @export
 */
API.Client.GetBusinessAssetsResponse.prototype.assetGroupInfo;

