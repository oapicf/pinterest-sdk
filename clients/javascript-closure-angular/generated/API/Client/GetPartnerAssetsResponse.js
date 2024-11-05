goog.provide('API.Client.GetPartnerAssetsResponse');

/**
 * An object containing the permissions a you/your business partner has on the asset.
 * @record
 */
API.Client.GetPartnerAssetsResponse = function() {}

/**
 * Unique identifier of a business asset.
 * @type {!string}
 * @export
 */
API.Client.GetPartnerAssetsResponse.prototype.assetId;

/**
 * Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
 * @type {!string}
 * @export
 */
API.Client.GetPartnerAssetsResponse.prototype.assetType;

/**
 * The permissions you or your partner has on the asset. If partner_type=INTERNAL, the permission levels are for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the permission levels are for the access you have to the partner's business asset.
 * @type {!Array<!string>}
 * @export
 */
API.Client.GetPartnerAssetsResponse.prototype.permissions;

/**
 * @type {!API.Client.AssetGroupBinding}
 * @export
 */
API.Client.GetPartnerAssetsResponse.prototype.assetGroupInfo;

