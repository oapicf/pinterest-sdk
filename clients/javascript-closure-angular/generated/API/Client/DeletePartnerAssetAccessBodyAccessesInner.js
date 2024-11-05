goog.provide('API.Client.DeletePartnerAssetAccessBody_accesses_inner');

/**
 * @record
 */
API.Client.DeletePartnerAssetAccessBodyAccessesInner = function() {}

/**
 * Unique identifier of a business partner to update asset access to.
 * @type {!string}
 * @export
 */
API.Client.DeletePartnerAssetAccessBodyAccessesInner.prototype.partnerId;

/**
 * Unique identifier of the business asset.
 * @type {!string}
 * @export
 */
API.Client.DeletePartnerAssetAccessBodyAccessesInner.prototype.assetId;

/**
 * If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
 * @type {!string}
 * @export
 */
API.Client.DeletePartnerAssetAccessBodyAccessesInner.prototype.partnerType;

/** @enum {string} */
API.Client.DeletePartnerAssetAccessBodyAccessesInner.PartnerTypeEnum = { 
  INTERNAL: 'INTERNAL',
  EXTERNAL: 'EXTERNAL',
}
