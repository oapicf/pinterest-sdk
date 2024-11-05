goog.provide('API.Client.business_member_assets_get_200_response');

/**
 * @record
 */
API.Client.BusinessMemberAssetsGet200Response = function() {}

/**
 * List asset permissions the given member was granted.
 * @type {!Array<!API.Client.AssetIdPermissions>}
 * @export
 */
API.Client.BusinessMemberAssetsGet200Response.prototype.items;

/**
 * @type {!string}
 * @export
 */
API.Client.BusinessMemberAssetsGet200Response.prototype.bookmark;

