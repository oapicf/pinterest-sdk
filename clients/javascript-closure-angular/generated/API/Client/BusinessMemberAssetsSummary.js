goog.provide('API.Client.BusinessMemberAssetsSummary');

/**
 * Ad accounts and profiles the business member/partner has access to.
 * @record
 */
API.Client.BusinessMemberAssetsSummary = function() {}

/**
 * List of ad account IDs and respective permission levels.
 * @type {!Array<!API.Client.AssetIdWithPermissions>}
 * @export
 */
API.Client.BusinessMemberAssetsSummary.prototype.adAccounts;

/**
 * List of profile IDs and respective permission levels.
 * @type {!Array<!API.Client.AssetIdWithPermissions>}
 * @export
 */
API.Client.BusinessMemberAssetsSummary.prototype.profiles;

