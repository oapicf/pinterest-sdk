goog.provide('API.Client.BusinessAssets');

/**
 * @record
 */
API.Client.BusinessAssets = function() {}

/**
 * An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'.
 * @type {!API.Client.AssetGroupBinding}
 * @export
 */
API.Client.BusinessAssets.prototype.assetGroupInfo;

/**
 * Unique identifier of a business asset.
 * @type {!string}
 * @export
 */
API.Client.BusinessAssets.prototype.assetId;

/**
 * @type {!API.Client.AssetTypeResponse}
 * @export
 */
API.Client.BusinessAssets.prototype.assetType;

/**
 * Permission levels the requesting business has on an asset.
 * @type {!Array<!string>}
 * @export
 */
API.Client.BusinessAssets.prototype.permissions;

/**
 * An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals 'CATALOG'.
 * @type {!API.Client.CatalogBinding}
 * @export
 */
API.Client.BusinessAssets.prototype.catalogInfo;

