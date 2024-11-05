goog.provide('API.Client.UpdatePartnerAssetsResult');

/**
 * An object containing the permissions a business partner has on the asset.
 * @record
 */
API.Client.UpdatePartnerAssetsResult = function() {}

/**
 * Unique identifier of a business asset.
 * @type {!string}
 * @export
 */
API.Client.UpdatePartnerAssetsResult.prototype.assetId;

/**
 * Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
 * @type {!string}
 * @export
 */
API.Client.UpdatePartnerAssetsResult.prototype.assetType;

/**
 * Unique identifier of a business partner.
 * @type {!string}
 * @export
 */
API.Client.UpdatePartnerAssetsResult.prototype.partnerId;

/**
 * Permission levels member or partner has on an asset.
 * @type {!Array<!string>}
 * @export
 */
API.Client.UpdatePartnerAssetsResult.prototype.permissions;

