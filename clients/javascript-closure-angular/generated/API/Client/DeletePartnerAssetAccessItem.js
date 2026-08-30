goog.provide('API.Client.DeletePartnerAssetAccessItem');

/**
 * @record
 */
API.Client.DeletePartnerAssetAccessItem = function() {}

/**
 * Unique identifier of the business asset.
 * @type {!string}
 * @export
 */
API.Client.DeletePartnerAssetAccessItem.prototype.assetId;

/**
 * Unique identifier of a business partner to update asset access to.
 * @type {!string}
 * @export
 */
API.Client.DeletePartnerAssetAccessItem.prototype.partnerId;

/**
 * If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset. If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
 * @type {!string}
 * @export
 */
API.Client.DeletePartnerAssetAccessItem.prototype.partnerType;

/** @enum {string} */
API.Client.DeletePartnerAssetAccessItem.PartnerTypeEnum = { 
  INTERNAL: 'INTERNAL',
  EXTERNAL: 'EXTERNAL',
}
