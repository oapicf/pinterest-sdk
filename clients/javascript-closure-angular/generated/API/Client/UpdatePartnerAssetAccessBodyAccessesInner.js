goog.provide('API.Client.UpdatePartnerAssetAccessBody_accesses_inner');

/**
 * @record
 */
API.Client.UpdatePartnerAssetAccessBodyAccessesInner = function() {}

/**
 * Unique identifier of a business partner to update asset access to.
 * @type {!string}
 * @export
 */
API.Client.UpdatePartnerAssetAccessBodyAccessesInner.prototype.partnerId;

/**
 * Unique identifier of the business asset.
 * @type {!string}
 * @export
 */
API.Client.UpdatePartnerAssetAccessBodyAccessesInner.prototype.assetId;

/**
 * A non-empty array of permissions to assign to the partner.
 * @type {!Array<!API.Client.Permissions>}
 * @export
 */
API.Client.UpdatePartnerAssetAccessBodyAccessesInner.prototype.permissions;

