goog.provide('API.Client.business_partner_asset_access_get_200_response');

/**
 * @record
 */
API.Client.BusinessPartnerAssetAccessGet200Response = function() {}

/**
 * List assets on which you granted access to your partner or assets on which your partner has granted you access.
 * @type {!Array<!API.Client.GetPartnerAssetsResponse>}
 * @export
 */
API.Client.BusinessPartnerAssetAccessGet200Response.prototype.items;

/**
 * @type {!string}
 * @export
 */
API.Client.BusinessPartnerAssetAccessGet200Response.prototype.bookmark;

