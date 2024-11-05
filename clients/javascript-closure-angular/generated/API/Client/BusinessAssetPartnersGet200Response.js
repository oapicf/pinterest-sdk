goog.provide('API.Client.business_asset_partners_get_200_response');

/**
 * @record
 */
API.Client.BusinessAssetPartnersGet200Response = function() {}

/**
 * List of partners with permissions to the asset.
 * @type {!Array<!API.Client.UserSingleAssetBinding>}
 * @export
 */
API.Client.BusinessAssetPartnersGet200Response.prototype.items;

/**
 * @type {!string}
 * @export
 */
API.Client.BusinessAssetPartnersGet200Response.prototype.bookmark;

