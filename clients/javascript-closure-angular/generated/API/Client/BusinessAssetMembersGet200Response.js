goog.provide('API.Client.business_asset_members_get_200_response');

/**
 * @record
 */
API.Client.BusinessAssetMembersGet200Response = function() {}

/**
 * List of members with permissions to the asset.
 * @type {!Array<!API.Client.UserSingleAssetBinding>}
 * @export
 */
API.Client.BusinessAssetMembersGet200Response.prototype.items;

/**
 * @type {!string}
 * @export
 */
API.Client.BusinessAssetMembersGet200Response.prototype.bookmark;

