goog.provide('API.Client.DeletePartnerAssetsResult');

/**
 * The terminated asset access.
 * @record
 */
API.Client.DeletePartnerAssetsResult = function() {}

/**
 * Unique identifier of a business asset.
 * @type {!string}
 * @export
 */
API.Client.DeletePartnerAssetsResult.prototype.assetId;

/**
 * Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
 * @type {!string}
 * @export
 */
API.Client.DeletePartnerAssetsResult.prototype.assetType;

/**
 * Permission levels member or partner has on an asset.
 * @type {!Array<!string>}
 * @export
 */
API.Client.DeletePartnerAssetsResult.prototype.permissions;

/**
 * If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset.<br> If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset.
 * @type {!boolean}
 * @export
 */
API.Client.DeletePartnerAssetsResult.prototype.isSharedPartner;

/**
 * Unique identifier of a business partner.
 * @type {!string}
 * @export
 */
API.Client.DeletePartnerAssetsResult.prototype.partnerId;

