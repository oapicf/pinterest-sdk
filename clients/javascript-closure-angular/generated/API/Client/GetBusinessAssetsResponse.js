goog.provide('API.Client.GetBusinessAssetsResponse');

/**
 * An object containing the permissions a business has on the asset.
 * @record
 */
API.Client.GetBusinessAssetsResponse = function() {}

/**
 * @type {!API.Client.AssetGroupBinding}
 * @export
 */
API.Client.GetBusinessAssetsResponse.prototype.assetGroupInfo;

/**
 * Unique identifier of a business asset.
 * @type {!string}
 * @export
 */
API.Client.GetBusinessAssetsResponse.prototype.assetId;

/**
 * Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
 * @type {!string}
 * @export
 */
API.Client.GetBusinessAssetsResponse.prototype.assetType;

/**
 * @type {!API.Client.GetBusinessAssetsResponse_catalog_info}
 * @export
 */
API.Client.GetBusinessAssetsResponse.prototype.catalogInfo;

