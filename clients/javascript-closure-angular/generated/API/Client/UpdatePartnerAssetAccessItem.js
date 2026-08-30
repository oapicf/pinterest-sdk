goog.provide('API.Client.UpdatePartnerAssetAccessItem');

/**
 * @record
 */
API.Client.UpdatePartnerAssetAccessItem = function() {}

/**
 * Unique identifier of the business asset.
 * @type {!string}
 * @export
 */
API.Client.UpdatePartnerAssetAccessItem.prototype.assetId;

/**
 * Unique identifier of a business partner to update asset access to.
 * @type {!string}
 * @export
 */
API.Client.UpdatePartnerAssetAccessItem.prototype.partnerId;

/**
 * A non-empty array of permissions to assign to the partner.
 * @type {!Array<!API.Client.Permissions>}
 * @export
 */
API.Client.UpdatePartnerAssetAccessItem.prototype.permissions;

